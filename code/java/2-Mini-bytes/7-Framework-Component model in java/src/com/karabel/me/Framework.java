package com.karabel.me;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Framework {

    public void doGreet(){
        try {

//            GreetingComponent instance1=new GreetingComponent();
//            instance1.hello();

            // via classpath scanning, we can find all comp & methods

            // Loading class dynamically to JVM by ClassName
            Class clazz1=Class.forName("com.karabel.you.EnglishGreetingComponent");
            // Create New Instance
            Object instance1=clazz1.newInstance();

            Method[] methods= clazz1.getMethods();
            for (Method method:methods){
                Greet greet=method.getAnnotation(Greet.class);
                if(greet!=null){
                    System.out.println("\uD83C\uDF3B".repeat(30));
                    method.invoke(instance1,new Object[]{});
                    System.out.println("\uD83C\uDF3B".repeat(30));
                }
            }

            Class clazz2=Class.forName("com.karabel.you.ArabicGreetingComponent");
            Object instance2=clazz2.newInstance();

            Method[] methods1= clazz2.getMethods();
            for (Method method:methods1){
                Greet greet=method.getAnnotation(Greet.class);
                if(greet!=null){
                    System.out.println("\uD83C\uDF3B".repeat(30));
                    method.invoke(instance2,new Object[]{});
                    System.out.println("\uD83C\uDF3B".repeat(30));
                }
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


}