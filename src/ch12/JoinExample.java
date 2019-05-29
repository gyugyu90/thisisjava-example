package ch12;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();


//        try {
//            sumThread.join(); // main thread가 대기하게끔 함
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
