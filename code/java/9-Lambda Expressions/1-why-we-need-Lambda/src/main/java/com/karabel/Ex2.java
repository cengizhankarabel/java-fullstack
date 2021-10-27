package com.karabel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Ex2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Local Inner Class
//        class EvenPredicate<E> implements Predicate<E> {
//            @Override
//            public boolean test(E e) {
//                Integer integer = (Integer) e;
//                return integer % 2 == 0;
//            }
//        }

        // Anonymous Inner Class

        // #Req-1 : collect all even numbers
        Predicate<Integer> evenPredicate = new Predicate<Integer>() {
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        List<Integer> evenNumbers = filter(numbers, evenPredicate);
        System.out.println(evenNumbers);


        // #Req-2 : collect all odd numbers
        Predicate<Integer> oddPredicate = new Predicate<Integer>() {
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        };
        List<Integer> oddNumbers = filter(numbers, oddPredicate);
        System.out.println(oddNumbers);

        // #Req-3 : collect all even numbers above five
        List<Integer> evenNumbersAboveFive=filter(numbers,new Predicate<Integer>(){
            @Override
            public boolean test(Integer n) {
                return n>5 && n%2==0;
            }
        });
        System.out.println(evenNumbersAboveFive);


    }


    //---------------------------------------------------------------
    // declarative style using anonymous class objects

    /*
    advantage:
        intention - implementation seperated
     */
    //---------------------------------------------------------------

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> output = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number))
                output.add(number);
        }
        return output;
    }

}