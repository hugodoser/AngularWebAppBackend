package com.hugo.courselab.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers(
                        HttpMethod.GET,
                        "/login*", "/static/**", "/*.js", "/*.json", "/*.ico")
                .permitAll()
                .antMatchers(HttpMethod.POST).hasAnyRole("USER", "ADMIN")
                .antMatchers(HttpMethod.GET).hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/index.html", true)
                .failureUrl("/login.html?error=true")
                .and()
                .logout()
                .logoutSuccessUrl("/login.html");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}user")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("{noop}admin")
                .roles("USER", "ADMIN");
    }

    @Bean
    public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        firewall.setAllowUrlEncodedSlash(true);
        return firewall;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //@formatter:off
        super.configure(web);
        web.httpFirewall(allowUrlEncodedSlashHttpFirewall());
    }
}