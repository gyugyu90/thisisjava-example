package ch12;

public class ThreadD extends Thread {
    public boolean stop = false; // 종료 플래그
    public boolean work = true; // 작업 진행 여부 플래그

    @Override
    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("ThreadD 작업 내용");
            } else {
                Thread.yield();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {}
        }

        System.out.println("ThreadD 종료");
    }
}
