package com.example.hw_8_2_1_1_dao_hibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true, jsr250Enabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    PasswordEncoder encoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .and()
                .authorizeRequests().antMatchers("/by-city").permitAll()
                .and()
                .authorizeRequests().antMatchers("/by-lessAge").hasAuthority("read")
                .and()
                .authorizeRequests().antMatchers("/by-name-surname").hasAuthority("read");
    }*/

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Boozooka").password(encoder().encode("qwertyuiop")).roles("READ", "WRITE", "DELETE")
                .and()
                .withUser("n1rds").password(encoder().encode("krovosisa")).roles("READ", "WRITE")
                .and()
                .withUser("Karhu").password(encoder().encode("password")).roles("READ", "DELETE")
                .and()
                .withUser("TsarPhonos").password(encoder().encode("not_password")).roles("READ")
                .and()
                .withUser("Reader").password(encoder().encode("apple")).roles("WRITE");
    }
}
