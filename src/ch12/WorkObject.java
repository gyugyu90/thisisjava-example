package ch12;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadE의 methodA() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadF를 실행 대기 상태로 만듦

        try {
            wait(); // ThreadE를 일시 정지 상태로 만듦
        } catch (InterruptedException ex) {

        }
    }

    public synchronized void methodB() {
        System.out.println("ThreadF의 methodB() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadE를 실행 대기 상태로 만듦

        try {
            wait(); // ThreadF를 일시 정지 상태로 만듦
        } catch (InterruptedException ex) {

        }
    }
}
