/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
/**
 *
 * @author nalog_ot01
 */
@EnableOAuth2Sso
//@EnableOAuth2Client
@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@Order(0)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
// @Override
//    public void configure(WebSecurity web) throws Exception {
//        super.configure(web);
//
//        web.ignoring()
//           .mvcMatchers("/favicon.ico", "/webjars/**", "/css/**");
//    }
@Bean
public OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext,
        OAuth2ProtectedResourceDetails details) {
    return new OAuth2RestTemplate(details, oauth2ClientContext);
}
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/find")
                    .authenticated()
                .antMatchers("/add")
                    .permitAll()
                .anyRequest()
                    .permitAll();
//                .and()
//            .oauth2Login();
//                .redirectionEndpoint()
//                .baseUri("/find");
    }
}
