package com.example;

import com.example.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        // init / boot phase

//        AccountRepository jdbcAccountRepository=new JdbcAccountRepository();
//        AccountRepository jpaAccountRepository=new JpaAccountRepository();
//        TransferService transferService = new TransferServiceImpl(jdbcAccountRepository);

        ConfigurableApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("transfer-service.xml");

        System.out.println("-".repeat(50));

        // use phase
        TransferService transferService=applicationContext.getBean("transferService",TransferService.class);
        transferService.transfer(1000.00, "1", "2");
        System.out.println("-".repeat(25));
        transferService.transfer(1000.00, "2", "1");

        System.out.println("-".repeat(50));

        // destroy phase
        applicationContext.close();

    }
}