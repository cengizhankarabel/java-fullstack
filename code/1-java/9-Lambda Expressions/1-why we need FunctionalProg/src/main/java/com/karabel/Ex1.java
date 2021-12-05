package com.karabel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // #Req-1 : collect all even numbers
        List<Integer> evenNumbers=getEvenNumbers(numbers);
        System.out.println(evenNumbers);

        // #Req-2 : collect all odd numbers
        List<Integer> oddNumbers=getOddNumbers(numbers);
        System.out.println(oddNumbers);

        // #Req-3 : collect all even numbers > 5
        List<Integer> evenNumbersAboveFive=getEvenNumbersAboveFive(numbers);
        System.out.println(evenNumbersAboveFive);

    }

    //------------------------------------------------------------------
    // Imperative style
    /*
        => solving any problem step-by step
            intention ( what ) + implementation ( How ) mixed together
     */
    //------------------------------------------------------------------

    private static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evens=new ArrayList<>();
        for(Integer number:numbers){
            if(number%2==0)
                evens.add(number);
        }
        return evens;
    }
    private static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> odds=new ArrayList<>();
        for(Integer number:numbers){
            if(number%2!=0)
                odds.add(number);
        }
        return odds;
    }
    private static List<Integer> getEvenNumbersAboveFive(List<Integer> numbers) {
        List<Integer> evens=new ArrayList<>();
        for(Integer number:numbers){
            if(number%2==0 && number>5)
                evens.add(number);
        }
        return evens;
    }

}