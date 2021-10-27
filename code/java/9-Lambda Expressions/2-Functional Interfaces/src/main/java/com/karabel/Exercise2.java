package com.karabel;


import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        List<String> menu=new ArrayList<>();
        menu.add("veg");
        menu.add("nveg");
        menu.add("veg");
        menu.add("nveg");
        menu.add("veg");

        // replace 'nveg' items with 'Nil'

        //------------------------------------------------------
        // imperative style
        //------------------------------------------------------

//        for (int i = 0; i < menu.size(); i++) {
//            String menuItem= menu.get(i);
//            if(menuItem.equals("nveg")){
//                menu.set(i,"Nil");
//            }
//        }


        //------------------------------------------------------
        // declarative style , FP
        //------------------------------------------------------

        menu.replaceAll(menuItem->menuItem.equals("nveg")?"Nil":menuItem);


        System.out.println(menu);


    }

}