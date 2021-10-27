package com.karabel;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;


@FunctionalInterface
interface TriFunction<X, Y, Z, R> {
    R apply(X x, Y y, Z z);
}


interface FoodSupplier {
    List<String> get(int i1, int i2);
}


public class FunctionalInterfaces_Ex {

    public static void main(String[] args) {

        // T -> R
        Function<String, Integer> function = s -> s.length();
//        System.out.println(function.apply("Nag"));

        // T -> boolean
        Predicate<String> predicate = str -> str.equals("revature");  // define / create function
//        System.out.println(predicate.test("Nag"));

        // () -> R
        Supplier<String> supplier = () -> "string";
//        System.out.println(supplier.get());

        // T -> void
        Consumer<String> consumer = string -> System.out.println(string);
//        consumer.accept("hello");

        //---------------------------------------------------------------------------------------

        BiFunction<Integer, Integer, Integer> biFunction = (n1, n2) -> n1 + n2;
        BiPredicate<Integer, Integer> biPredicate = (n1, n2) -> n1 > n2;
        BiConsumer<Integer, Integer> biConsumer = (n1, n2) -> System.out.println(n1 + n2);

        //---------------------------------------------------------------------------------------

        UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;

        //---------------------------------------------------------------------------------------

        BiFunction<Integer, Integer, Integer> add = (n1, n2) -> n1 + n2;

        int x = 12;
        int y = 13;

        int result = add.apply(x, y);
        System.out.println(result);

        //---------------------------------------------------------------------------------------
        // Primitive type functional interfaces
        //---------------------------------------------------------------------------------------

        IntBinaryOperator add1 = (n1, n2) -> n1 + n2;
        result = add.apply(x, y);
        System.out.println(result);

        DoubleBinaryOperator doubleBinaryOperator = (d1, d2) -> d1 + d2;
        LongBinaryOperator longBinaryOperator = (l1, l2) -> l1 + l2;

        IntUnaryOperator intUnaryOperator = n -> n + 10;
        LongUnaryOperator longUnaryOperator = l -> l + 10;


        ToIntFunction<String> stringToIntFunction = s -> s.length();
        ToLongFunction<String> toLongFunction = s -> s.length();

        //----------------------------------------------------------------

        // Custom Functional Interface
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (n1, n2, n3) -> n1 + n2 + n3;

        int result1 = triFunction.apply(123, 123, 123);
        System.out.println(result1);

        //----------------------------------------------------------------

        FoodSupplier foodSupplier = (pay1, pay2) -> Arrays.asList("food-item1", "food-item-2");


    }

}