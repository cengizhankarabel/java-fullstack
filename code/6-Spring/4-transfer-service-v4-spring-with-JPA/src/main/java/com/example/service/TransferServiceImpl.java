package com.example.service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class TransferServiceImpl implements TransferService {

    private AccountRepository accountRepository;

    // constructor-level DI
    @Autowired
    public TransferServiceImpl(@Qualifier("jpa") AccountRepository accountRepository) {
        this.accountRepository=accountRepository;
        log.info("TransferServiceImpl instance created...");
    }

    @Override
    @Transactional
    public void transfer(double amount, int srcAccNum, int targetAccNum) {
        log.info("transfer initiated.");

        Account srcAccount = accountRepository.loadAccount(srcAccNum);
        Account targetAccount = accountRepository.loadAccount(targetAccNum);

        srcAccount.setBalance(srcAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance() + amount);

        accountRepository.updateAccount(srcAccount);
        accountRepository.updateAccount(targetAccount);

        log.info("transfer finished.");
    }
}