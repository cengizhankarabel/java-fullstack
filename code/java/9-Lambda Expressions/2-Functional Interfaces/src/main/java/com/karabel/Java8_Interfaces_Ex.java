package com.karabel;

interface Collection {
    // constant variables
    // abstract method
    void add(String e); // // 1998

    void clear(); // 1998

//    void forEach();

    default void forEach() {
        // default iteration logic
    }

}

interface List extends Collection {
    void add(int idx, String e);
}


// Team=1
class ArrayList implements List {
    @Override
    public void add(String e) {

    }

    @Override
    public void add(int idx, String e) {

    }

    @Override
    public void clear() {

    }


}

// team-2
class LinkedList implements List {
    @Override
    public void add(String e) {

    }

    @Override
    public void add(int idx, String e) {

    }

    @Override
    public void clear() {

    }
}


public class Java8_Interfaces_Ex {
    public static void main(String[] args) {


        List list = new ArrayList();
        list.forEach();


    }
}