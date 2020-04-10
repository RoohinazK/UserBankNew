package com.mindtree.bankuser;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 
@Configuration
@EnableOAuth2Sso
@EnableWebSecurity

public class ApplicationSecurity extends WebSecurityConfigurerAdapter  {
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**").authorizeRequests().antMatchers("/", "/callback").permitAll().antMatchers("/", "/addBank").permitAll().antMatchers("/", "/addBankToDb").permitAll().antMatchers("/", "/success").permitAll().antMatchers("/", "/display").permitAll().antMatchers("/", "/bankUserLinker").permitAll().antMatchers("/", "/linkBankAndUser").permitAll().antMatchers("/", "/link").permitAll().antMatchers("/", "/deleteUser").permitAll().antMatchers("/", "/delete").permitAll().antMatchers("/", "/deleted").permitAll().antMatchers("/", "/deleted").permitAll().antMatchers("/", "/addUser").permitAll().antMatchers("/", "/addUserToDb").permitAll().antMatchers("/", "/deleted").permitAll().anyRequest().authenticated();
    }
	

}
