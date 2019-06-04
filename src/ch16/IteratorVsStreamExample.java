package ch16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "김자바");

        // Iterator 이용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();

        // Stream 이용
        list.forEach(System.out::println);


    }
}
