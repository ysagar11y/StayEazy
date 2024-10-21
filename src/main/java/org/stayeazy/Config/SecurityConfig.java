package org.stayeazy.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        return http.csrf(csrf->csrf.disable())
                .authorizeRequests()
                .requestMatchers("/register").permitAll()
                .requestMatchers("/login").authenticated()
                .and()
                .formLogin(Customizer.withDefaults())
                .build();
    }

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
