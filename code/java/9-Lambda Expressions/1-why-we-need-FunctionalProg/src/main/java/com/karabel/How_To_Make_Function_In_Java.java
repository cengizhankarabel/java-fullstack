package com.karabel;

public class How_To_Make_Function_In_Java {

    public static void main(String[] args) {

        //----------------------------------------------------
        // Named Local Inner class
        //----------------------------------------------------
        class EvenPredicate<E> implements Predicate<E> {
            @Override
            public boolean test(E e) {
                return (Integer) e % 2 == 0;
            }
        }
        Predicate<Integer> isEven = new EvenPredicate();

        //----------------------------------------------------
        // Anonymous Local Inner Class
        //----------------------------------------------------

        isEven=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };

        //----------------------------------------------------
        // Java 1.8 , Lambda Expression i.e java-function
        //----------------------------------------------------

        isEven = (Integer n) -> {
            return n % 2 == 0;
        };

        // - or -

        isEven = (n) -> {
            return n % 2 == 0;
        };

        // - or

        isEven = n -> {
            return n % 2 == 0;
        };

        // -or-

        isEven = n -> n % 2 == 0;

        //-------------------------------------------
    }

}