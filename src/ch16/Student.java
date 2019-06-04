package ch16;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        // score < o.score : 음수 리턴
        // score == score : 0
        // score > o.score : 양수 리턴
        return Integer.compare(score, o.score);
    }
}
