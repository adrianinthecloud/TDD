package com.osfocus.tdd.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class FocusApplication {

    public static void main(String[] args) {
        SpringApplication.run(FocusApplication.class, args);
    }

}
