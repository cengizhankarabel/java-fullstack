package com.example;

import com.example.config.TransferServiceConfiguration;
import com.example.service.TransferService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Application {
    public static void main(String[] args) {

        // init / boot phase
        System.out.println("-".repeat(50));

        ConfigurableApplicationContext applicationContext=null;
        applicationContext= SpringApplication.run(TransferServiceConfiguration.class);

        System.out.println("-".repeat(50));

        // use phase
        TransferService transferService=applicationContext.getBean(TransferService.class);
        transferService.transfer(400.00, 1, 2);

        //------------------------------------------------------
        //Destroy phase
        //------------------------------------------------------

    }
}