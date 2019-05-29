package ch12;

public class YieldExample {
    public static void main(String[] args) {
        ThreadC threadC = new ThreadC();
        ThreadD threadD = new ThreadD();

        threadC.start();
        threadD.start();

        try { Thread.sleep(1000); } catch (InterruptedException ex) { }
        System.out.println("HERE");
        threadC.work = false;

        try { Thread.sleep(1000); } catch (InterruptedException ex) { }
        System.out.println("HERE2");
        threadC.work = true;

        try { Thread.sleep(1000); } catch (InterruptedException ex) { }
        System.out.println("HERE3");
        threadC.stop = true;
        threadD.stop = true;
    }
}
