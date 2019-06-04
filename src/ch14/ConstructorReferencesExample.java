package ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member2> function = Member2::new;
        Member2 member = function.apply("angel");

        BiFunction<String, String, Member2> function1 = Member2::new;
        Member2 member1 = function1.apply("신천사", "angel");

    }
}