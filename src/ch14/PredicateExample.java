package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    private static List<Pupil> list = Arrays.asList(
            new Pupil("홍길동", "남자", 90),
            new Pupil("김순희", "여자", 90),
            new Pupil("김자바", "남자", 95),
            new Pupil("박한나", "여자", 92)
    );

    public static double avg(Predicate<Pupil> predicate) {
        int count = 0, sum = 0;
        for(Pupil pupil: list) {
            if(predicate.test(pupil)) {
                count++;
                sum += pupil.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg( t -> t.getGender().equals("남자"));
        System.out.println("남자 평균 점수: " + maleAvg);

        double femaleAvg = avg( t -> t.getGender().equals("여자"));
        System.out.println("여자 평균 점수: " + femaleAvg);
    }



}

class Pupil {
    private String name;
    private String gender;
    private int score;

    public Pupil(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getScore() {
        return score;
    }
}