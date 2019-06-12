package ch16;

public class Student implements Comparable<Student>{
    private String name;
    private int score;
    private Sex sex;
    private City city;

    public enum Sex {
        MALE, FEMALE
    }

    public enum City {
        Seoul, Pusan
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Sex getSex() {
        return sex;
    }

    public City getCity() {
        return city;
    }

    @Override
    public int compareTo(Student o) {
        // score < o.score : 음수 리턴
        // score == score : 0
        // score > o.score : 양수 리턴
        return Integer.compare(score, o.score);
    }
}
