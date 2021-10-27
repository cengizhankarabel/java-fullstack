package com.karabel;

// Functional Interface

/*
    rules:
        => it must one single abstract method
 */
@FunctionalInterface
public interface Predicate<E> {
    boolean test(E e);
}