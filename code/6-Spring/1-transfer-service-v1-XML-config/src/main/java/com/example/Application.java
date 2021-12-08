package com.example;

import com.example.service.TransferServiceImpl;

public class Application {

    public static void main(String[] args) {

        TransferServiceImpl transferService = new TransferServiceImpl();

        transferService.transfer(1000.00,"1","2");
        System.out.println();
        transferService.transfer(1000.00,"2","1");

        // destroy phase
        transferService = null;
    }
}
