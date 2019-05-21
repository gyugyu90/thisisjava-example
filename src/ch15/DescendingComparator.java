package ch15;

import java.util.Comparator;

// 가격 내림차순
public class DescendingComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {

        if(o1.getPrice() < o2.getPrice()) return 1;
        else if(o1.getPrice() == o2.getPrice()) return 0;
        else return -1; // 가격이 클 경우
    }
}
