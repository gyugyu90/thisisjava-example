package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김자바", 25));
        treeSet.add(new Person("박지원", 31));

        Iterator<Person> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.getName() + ":" + person.getAge());
        }

        TreeSet<Fruit> treeset2 = new TreeSet<>(new DescendingComparator());
        treeset2.add(new Fruit("포도", 3000));
        treeset2.add(new Fruit("수박", 10000));
        treeset2.add(new Fruit("딸기", 6000));

        Iterator<Fruit> iterator1 = treeset2.iterator();
        while(iterator1.hasNext()) {
            Fruit fruit = iterator1.next();
            System.out.println(fruit.getName() + ":" + fruit.getPrice());
        }


    }

}
