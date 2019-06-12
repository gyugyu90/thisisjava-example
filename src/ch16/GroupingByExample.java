package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
                new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Seoul),
                new Student("신용권", 10, Student.Sex.MALE, Student.City.Pusan),
                new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Pusan)
        );

//        Stream<Student> totalStream = totalList.stream();
//        Function<Student, Student.City> classifier = Student::getCity;
//        Function<Student, String> mapper = Student::getName;
//        Collector<String, ?, List<String>> collector1 = Collectors.toList();
//        Collector<Student, ?, List<String>> collector2 = Collectors.mapping(mapper, collector1);
//        Collector<Student, ?, Map<Student.City, List<String>>> collector3 = Collectors.groupingBy(classifier, collector2);
//        Map<Student.City, List<String>> mapByCity = totalStream.collect(collector3);

        Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        System.out.print("[남학생] ");
        mapBySex.get(Student.Sex.MALE)
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println();

        System.out.print("[여학생] ");
        mapBySex.get(Student.Sex.FEMALE)
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println();

        Map<Student.City, List<String>> mapByCity = totalList.stream()
                .collect(Collectors.groupingBy(
                                Student::getCity,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        System.out.print("[서울] ");
        mapByCity.get(Student.City.Seoul).forEach(s -> System.out.print(s + " "));

        System.out.println();

        System.out.print("[부산] ");
        mapByCity.get(Student.City.Seoul).forEach(s -> System.out.print(s + " "));
    }

}
