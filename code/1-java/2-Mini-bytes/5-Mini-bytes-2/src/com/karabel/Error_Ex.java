package com.karabel;

public class Error_Ex {
    public static void main(String[] args) {

        int memorySize=0;

        try {
            if (memorySize == 0)
                throw new OutOfMemoryError("no memory");
        }catch (OutOfMemoryError e){
            System.exit(0);
        }
    }
}