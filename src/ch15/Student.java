package ch15;

public class Student {
    private int sno;
    private String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            return sno == student.getSno() && name.equals(student.getName());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return sno + name.hashCode();
    }
}
