package ch13;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("홍길동");
        String name = box1.get();

        Box<Integer> box2 = new Box<>();
        box2.set(6); // 자동 boxing
        int value = box2.get(); // 자동 unboxing
    }
}
