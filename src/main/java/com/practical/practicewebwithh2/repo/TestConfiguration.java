package com.practical.practicewebwithh2.repo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public TestBeans getTestBeans() {
        return new TestBeans();
    }
}
