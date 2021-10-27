package com.karabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        List<String> menu=new ArrayList<>();
        menu.add("veg");
        menu.add("nveg");
        menu.add("veg");
        menu.add("nveg");
        menu.add("veg");

        // remove 'nveg' items from above menu.

        //----------------------------------------------------
        // imperative style ( what + How )
        //----------------------------------------------------

//        Iterator<String> iterator= menu.iterator();
//        while(iterator.hasNext()){
//            String menuItem=iterator.next();
//            if(menuItem.equals("nveg")){
//                //menu.remove(menuItem);
//                iterator.remove();
//            }
//        }



//        Iterator<String> iterator= menu.iterator();
//        while(iterator.hasNext()){
//            String menuItem=iterator.next();
//            if(menuItem.equals("veg")){
//                //menu.remove(menuItem);
//                iterator.remove();
//            }
//        }


        //----------------------------------------------------
        // declarative style using functions / Lambda Expressions ( what )
        //---------------------------------------------------

        menu.removeIf(menuItem->menuItem.equals("nveg"));
        System.out.println(menu);

        menu.removeIf(menuItem->menuItem.equals("veg"));
        System.out.println(menu);


    }

}