package ch16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {

    // 요소 처리
    public static void work(int value){}


    // 병렬 처리
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.parallelStream().forEach(ArrayListVsLinkedListExample::work);
        long end = System.nanoTime();;
        long runTime = end - start;
        return runTime;
    }

    public static void main(String[] args) {
        // 소스 컬렉션
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 워밍업
        long arrayListParallel = testParallel(arrayList);
        long linkedListParallel = testParallel(linkedList);

        // 병렬 스트림 처리 시간 구하기
        arrayListParallel = testParallel(arrayList);
        linkedListParallel = testParallel(linkedList);

        if(arrayListParallel < linkedListParallel) {
            System.out.println("arraylist 처리가 더 빠름");
        } else {
            System.out.println("linkedlist 처리가 더 빠름");
        }

    }

}
