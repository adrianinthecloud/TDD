package com.osfocus.tdd.mock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                    .antMatchers("/", "/home", "/version", "/css/**", "/js/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
//                    .loginPage("/login")
//                    .permitAll()
                    .and()
                .logout()
                    .permitAll();
//        super.configure(http);
    }

//    @Bean
//    @Override
//    protected UserDetailsService userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                                .username("Adrian")
//                                .password("testx")
//                                .roles("USER")
//                                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
}
