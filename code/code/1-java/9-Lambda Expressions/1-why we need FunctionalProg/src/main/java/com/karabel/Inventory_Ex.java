package com.karabel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inventory_Ex {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );
//        List<Apple> result = filterApples(inventory, apple -> apple.getColor().equals("green"));
//        List<Apple> result=filterApples(inventory,apple -> apple.getColor().equals("red"));
//        List<Apple> result=filterApples(inventory,fruit -> fruit.getWeight()>150);
//        List<Apple> result=filterApples(inventory,fruit -> fruit.getColor().equals("red")&&fruit.getWeight()>150);
//
//        for (Apple apple : result) {
//            System.out.println(apple);
//        }
    }
    // open for extension ( mean for any condition can filter apples ) , closed for modification
    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
