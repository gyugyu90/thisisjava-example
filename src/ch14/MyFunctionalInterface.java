package ch14;

// annotation이 없더라도 하나의 추상 메소드만 있다면 모두 함수적 인터페이스
// annotation은 복수의 추상 메소드가 없는지를 확인해준다.
@FunctionalInterface
public interface MyFunctionalInterface {
    public void method(); // 꼭 하나만 있어야 함
}
