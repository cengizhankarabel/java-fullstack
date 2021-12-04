package com.karabel;

public class MutableString_Ex {

    public static void main(String[] args) {

        StringBuilder sql=new StringBuilder("select * flights where ");

        boolean byPrice=false;
        if(byPrice){
            sql.append("price=?");
        }
        boolean byDuration=true;
        if(byDuration){
            sql.append("duration=?");
        }
        System.out.println(sql);

        String sqlString= sql.toString();
    }

}