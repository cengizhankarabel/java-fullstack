package com.karabel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
    in Java ,
        => primitives & objects are first-class citizens
        => functions are not
   -----------------------------------------------------------------------
   how to make function as fist-class citizens?
   Predicate<Integer> evenPredicate = new Predicate<Integer>() {
        public boolean test(Integer integer) {
            return integer % 2 == 0;
        }
    };
    |
    |
    |
    V
    Predicate<Integer> evenPredicate =
        public boolean test(Integer integer) {
            return integer % 2 == 0;
        };
    |
    |
    |
    V
     Predicate<Integer> evenPredicate =
         boolean test(Integer integer) {
            return integer % 2 == 0;
        };
    |
    |
    |
    V
     Predicate<Integer> evenPredicate =
          test(Integer integer) {
            return integer % 2 == 0;
        };
    |
    |
    |
    V
     Predicate<Integer> evenPredicate =
          (Integer integer) {
            return integer % 2 == 0;
        };
    |
    |
    |
    V
    -----------------------------------------------
    Lambda Expression ==> is valid function java language
    -----------------------------------------------
     Predicate<Integer> evenPredicate =
          (Integer integer) -> {
            return integer % 2 == 0;
        };
 */

public class Ex3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // #Req-1 : collect all even numbers
        List<Integer> evenNumbers = filter(numbers, integer -> integer % 2 == 0);
        System.out.println(evenNumbers);

        // #Req-2 : collect all odd numbers
        List<Integer> oddNumbers = filter(numbers, integer -> integer%2!=0);
        System.out.println(oddNumbers);

        // #Req-3 : collect all even numbers above five
        List<Integer> evenNumbersAboveFive = filter(numbers, n->n > 5 && n % 2 == 0);
        System.out.println(evenNumbersAboveFive);

        // #Req-3 : collect all even numbers above five
        List<Integer> oddNumbersAboveFive = filter(numbers, n->n > 5 && n % 2 != 0);
        System.out.println(oddNumbersAboveFive);


    }


    //---------------------------------------------------------------
    // declarative style using Lambda expressions ==> functional Programming
    /*
    advantage:
        intention - implementation seperated
     */
    //---------------------------------------------------------------
    // Why should i Functional Programming

    /*
        => to write compact & concise code
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