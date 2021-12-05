package com.karabel;

class Super{
    public void abc(){
        System.out.println("Super:abc()");
    }
}

class Sub extends Super{
    /*
        // overriding rules
        Must be same
            => method-name
            => Type && Number && order arguments
            => Return Type
     */

    @Override // annotation , describe about your program elements to other programs ( compiler , JRE , third-party lib | framework )
    public void abc(){
        System.out.println("Sub:abc()");
    }

}



class MarryLib{
    // date : 12/12/2006
    @Deprecated
    public static void abc(){
        System.out.println("CengizhanKarabel:abc(}");
    }
    // date : 10/19/2021
    public static void xyz(){
        System.out.println("CengizhanKarabel:abc(}");
    }
}



public class Annotations_Ex {
    public static void main(String[] args) {

        Sub sub=new Sub();
        sub.abc();

        MarryLib.xyz();

        Integer integer=new Integer(12);





    }
}