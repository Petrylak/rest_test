package com.game.rest_test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("w")
                .password("{noop}p")
                .roles("USER", "ADMIN");
    }

    // dodanie podstrony /mainmenu którą można zobaczyć dopiero po zalogowaniu
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").authenticated()
                .antMatchers("/mainmenu").authenticated()
                // zezwolenie na uruchomienie konsoli h2
                .antMatchers("/h2-console/**").permitAll()
                .and().formLogin();
        // zezwolenie na uruchomienie konsoli h2
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }

}
