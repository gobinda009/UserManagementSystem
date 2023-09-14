package com.gobinda.User.Management.System;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class EntityObjects {
    @Bean
    public List<User> NewUser(){
        return new ArrayList<>();
    }

}
