package com.mobydigital.apirest;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	//Desabilito el csrf en Sprig Security para poder hacer POST/PUT/DELETE desde postman
	//Lo ideal sería configurar un token en el header para validar
	@Override
    protected void configure(HttpSecurity http) throws Exception {    
        http
            .csrf().disable()
            .authorizeRequests()
                .anyRequest().permitAll();
        }
}
