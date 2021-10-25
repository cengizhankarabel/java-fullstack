package com.karabel;


// external resources,file-system,db,n/w sockets

import java.io.Closeable;

class ExternalResource implements Closeable {
    public ExternalResource() {
        System.out.println("init..");
    }

    public void readOrWrite() {
        System.out.println("read/write operations..");
        if (System.currentTimeMillis() % 2 == 0) // dummy condition
            // file-permission failed..
            throw new IllegalStateException("file-permission");
    }

    public void close() {
        System.out.println("close..");
    }
}


public class Try_Catch_Finally_Syntax {
    public static void main(String[] args) {

        /*
        ExternalResource resource = new ExternalResource();
        try {
            resource.readOrWrite();
            return;
        }catch (IllegalStateException e){
            System.out.println("Ex-"+e.getMessage());
        }finally {
            resource.close();
        }
        */

        //

//        From JDK 1.7 // Auto Closable Resource

        ExternalResource externalResource=new ExternalResource();
        try(externalResource){
            externalResource.readOrWrite();
        }catch (IllegalStateException e){
            System.out.println("Ex-"+e.getMessage());
        }

    }
}