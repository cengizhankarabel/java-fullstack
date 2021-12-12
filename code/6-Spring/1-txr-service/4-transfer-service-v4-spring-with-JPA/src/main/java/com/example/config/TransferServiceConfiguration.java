package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(value = {JpaConfiguration.class})
@ComponentScan(basePackages = {"com.example"})
@EnableTransactionManagement
public class TransferServiceConfiguration {


}
