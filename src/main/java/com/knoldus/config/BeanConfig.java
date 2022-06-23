package com.knoldus.config;

import com.knoldus.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

}
