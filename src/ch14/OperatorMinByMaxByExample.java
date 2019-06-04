package ch14;

import ch15.Fruit;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;
        Fruit fruit;

        binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())); // Comparator.comparingInt(Fruit::getPrice)
        fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
        System.out.println(fruit.getName());

        binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())); // Comparator.comparingInt(Fruit::getPrice)
        fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
        System.out.println(fruit.getName());
    }
}
