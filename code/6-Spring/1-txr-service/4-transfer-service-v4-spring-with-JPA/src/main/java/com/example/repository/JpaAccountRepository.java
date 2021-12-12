package com.example.repository;

import com.example.entity.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Slf4j
@Component
@Qualifier("jpa")
public class JpaAccountRepository implements AccountRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public JpaAccountRepository() {
        log.info("JpaAccountRepository instance created..");
    }

    @Override
    public Account loadAccount(int number) {
        log.info("loading account " + number);
        return entityManager.find(Account.class, number);
    }

    @Override
    public void updateAccount(Account account) {
        log.info("updating account " + account.getNumber());
        entityManager.merge(account);

    }

}