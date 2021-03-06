package ch12;

public class DataBox {

    private String data;

    public synchronized String getData() {
        if(this.data == null) {
            try {
                wait();
            } catch (InterruptedException ex) {

            }
        }

        String returnValue = data;

        System.out.println("ConsumerThread가 읽은 데이터: " + returnValue);
        data = null;
        notify();

        return returnValue;
    }

    public synchronized void setData(String data) {
        if(this.data != null) {
            try {
                wait();
            } catch (InterruptedException ex) {

            }
        }

        this.data = data;
        System.out.println("ProducerThread가 생성한 데이터: " + data);
        notify(); // 소비자 스레드를 실행 대기 상태로 만듦

    }

}
