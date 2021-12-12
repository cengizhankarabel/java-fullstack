package com.example.springconfig;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.service.TransferService;
import com.example.service.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransferServiceConfiguration {

        @Bean
        public AccountRepository jdbcAccountRepository(){
            return new JdbcAccountRepository();
        }

        @Bean
        public AccountRepository jpaAccountRepository(){
            return new JpaAccountRepository();
        }

        @Bean
        public TransferService transferService(){
            return new TransferServiceImpl(jdbcAccountRepository());
        }
}
