package ch12;

public class Calculator {

    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        Calculator.this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {

        }
        System.out.println(Thread.currentThread().getName() + ": " + Calculator.this.memory);
    }
}
