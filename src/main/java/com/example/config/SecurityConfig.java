package com.example.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
        .antMatchers("/loginForm").permitAll() 
        .anyRequest().authenticated();
		
		
	    http.formLogin()
	        .loginProcessingUrl("/login") 
	        .loginPage("/loginForm") 
	        .usernameParameter("email") 
	        .passwordParameter("password") 
	        .defaultSuccessUrl("/library", true) 
	        .failureUrl("/loginForm?error"); 
	    
	    http.logout()
        .logoutUrl("/logout")
        .logoutSuccessUrl("/loginForm"); 
	}
	
	 @Override
	    public void configure(WebSecurity web) throws Exception {
	       
	        web.ignoring().antMatchers("/css/**", "/js/**");
	    }
}
