package ch12;

public class TargetThread extends Thread {

    @Override
    public void run() {
        for(long i = 0; i<1_000_000_000; i++) { }

        try {
            Thread.sleep(1500);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        for(long i = 0; i<1_000_000_000; i++) { }
    }
}
