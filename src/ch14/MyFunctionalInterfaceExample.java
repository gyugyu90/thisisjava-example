package ch14;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();

        // params
        MyFunctionalInterfaceWithParams fip;
        fip = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fip.method(2);

        fip = (x) -> {
            System.out.println(x * 5);
        };
        fip.method(2);

        fip = x -> System.out.println(x * 5);
        fip.method(2);

        // returns
        MyFunctionalInterfaceWithReturn fir;

        fir = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fir.method(2, 5));

        fir = (x, y) -> { return x + y; };
        System.out.println(fir.method(2, 5));

        fir = (x, y) -> x + y;
        System.out.println(fir.method(2, 5));

        fir = (x, y) -> sum(x, y);
        System.out.println(fir.method(2, 5));


    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
