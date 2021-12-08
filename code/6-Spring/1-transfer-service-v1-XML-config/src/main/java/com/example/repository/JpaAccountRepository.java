package com.example.repository;

import com.example.model.Account;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JpaAccountRepository implements AccountRepository {

    public JpaAccountRepository() {
        log.info("JpaAccountRepository instance created..");
    }

    public Account loadAccount(String number) {
        log.info("loading account " + number);
        return new Account(number, 1000.00);
    }

    public void updateAccount(Account account) {
        log.info("updating account " + account.getNumber());
    }


}