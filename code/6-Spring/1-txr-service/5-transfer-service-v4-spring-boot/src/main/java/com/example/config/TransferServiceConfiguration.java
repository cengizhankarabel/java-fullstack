package com.example.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Entity;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example"})
@EntityScan(value = {"com.example.entity"})
@EnableTransactionManagement
public class TransferServiceConfiguration {


}
