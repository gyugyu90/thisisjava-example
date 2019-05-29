package ch12;

public class StatePrintThread extends Thread {

    private Thread targetThread;

    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while (true) {
            Thread.State state = targetThread.getState();

            System.out.println("타겟 스레드 상태: " + state);

            if(state == State.NEW) {
                targetThread.start();
            } else if(state == State.TERMINATED) {
                break;
            }

            try {
                Thread.sleep(250); // 0.25초간 일시 정지
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
