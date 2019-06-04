package ch14;

public class UsingLocalVariable {
    void method(int arg) { // arg는 final 특성을 가짐
        int localVar = 40; // localVar는 final 특성을 가짐

        // arg = 31;
        // localVar = 41;

        // 람다식
        MyFunctionalInterface fi = () -> {
            // 로컬 변수 읽기
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar);
        };
        fi.method();
    }

    // final을 붙여서 시작하면 변경이 안 된다.
    // 붙이지 않았을 때는 final일 수도 있다고 간주하나 보다.
    // 변경했을 경우에는 final이 아니게 된다.
}
