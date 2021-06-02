package com.gstu.server.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class AppConfiguration {

    @Bean
    public ObjectMapper getMapper(){
        return new ObjectMapper();
    }
}
