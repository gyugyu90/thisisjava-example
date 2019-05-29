package ch12;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 공유객체 생성

        ThreadE threadE = new ThreadE(sharedObject);
        ThreadF threadF = new ThreadF(sharedObject);

        threadE.start();
        threadF.start();
    }
}
