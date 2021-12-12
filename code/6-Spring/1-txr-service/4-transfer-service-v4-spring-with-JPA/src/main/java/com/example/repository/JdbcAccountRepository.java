package com.example.repository;

import com.example.entity.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Qualifier("jdbc")
public class JdbcAccountRepository implements  AccountRepository{

    public JdbcAccountRepository() {
        log.info("JdbcAccountRepository instance created..");
    }

    public Account loadAccount(int number) {
        log.info("loading account " + number);
        return new Account(number, 1000.00);
    }

    public void updateAccount(Account account) {
        log.info("updating account " + account.getNumber());
    }


}
