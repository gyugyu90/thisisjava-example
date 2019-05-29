package ch12;

public class PrintThread2 extends Thread {

    @Override
    public void run() {
//        try {
            while (true) {
                System.out.println("실행 중");
                // Thread.sleep(100); // 일시 정지가 되어야 interrupt() 할 수 있음
                if(Thread.interrupted()) {
                    break;
                }
            }
//        } catch (InterruptedException ex) {
//        }
        System.out.println("자원 정리, 실행 종료");
    }
}
