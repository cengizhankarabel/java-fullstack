package com.karabel;

/*
// Inner Types ( class | interface | enum | annotation )
    1. non-static
    2. static
    3. local
    4. Anonymous
    why we need ?
    => if we strong-association between 2 types
        w can achieve encapsulation
*/


import java.util.Iterator;

class LinkedList<E> implements Iterable<E> {

    private Node head;
    private Node last;

    public void add(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            this.head = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;
    }

    @Override
    public Iterator<E> iterator() {

        // way-1 : Named Local Inner Type
//        class Ite implements Iterator {
//            Node temp = head;
//            @Override
//            public boolean hasNext() {
//                if(temp!=null)
//                    return true;
//                else
//                    return false;
//            }
//            @Override
//            public E next() {
//                E e = (E) temp.getContent();
//                temp = temp.getNext();
//                return e;
//            }
//        }

//        return new Ite();

        // way-2:  Anonymous Local Inner Type

        return new Iterator() {

            Node temp = head;

            public boolean hasNext() {
                if (temp != null)
                    return true;
                else
                    return false;
            }

            public E next() {
                E e = (E) temp.getContent();
                temp = temp.getNext();
                return e;
            }

        };



    }

    // Non-static Inner Type
    private class Node {
        private E content;
        private Node next;

        public Node(E content) {
            this.content = content;
        }

        public Node(E content, Node next) {
            this.content = content;
            this.next = next;
        }

        public E getContent() {
            return content;
        }

        public void setContent(E content) {
            this.content = content;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}


public class Ex {
    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(15);
        myLinkedList.add(3);
        myLinkedList.add(17);
        myLinkedList.add(90);
        myLinkedList.add(100);


        Iterator<Integer> iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }

//        //---------------------------------------------------------
//        for (Integer integer : myLinkedList) {
//            System.out.println(integer);
//        }
        //---------------------------------------------------------


    }
}