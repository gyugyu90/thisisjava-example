package ch15;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 95); // hashCode() 재정의... 같은 키로 인식

        System.out.println("총 Entry 수 : " + map.size());
    }


}
