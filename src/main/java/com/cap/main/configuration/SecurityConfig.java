//package com.cap.main.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
///**
// * Configuration class for defining Spring Security filters and access rules.
// */
//@Configuration
//
//@EnableMethodSecurity
//public class SecurityConfig {
//
//	private final JwtAuthenticationFilter jwtAuthenticationFilter;
//    private final JwtAuthenticationEntryPoint authenticationEntryPoint;
//    private final UserDetailsService userDetailsService;
//
//
//    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter,
//			JwtAuthenticationEntryPoint authenticationEntryPoint, UserDetailsService userDetailsService) {
//		super();
//		this.jwtAuthenticationFilter = jwtAuthenticationFilter;
//		this.authenticationEntryPoint = authenticationEntryPoint;
//		this.userDetailsService = userDetailsService;
//	}
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests()
//            .anyRequest().authenticated();
//        return http.build();
//    }
//	@Bean
//	public AuthenticationProvider authenticationProvider() {
//	    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//	    provider.setUserDetailsService(userDetailsService);
//	    provider.setPasswordEncoder(passwordEncoder());
//	    return provider;
//	}
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//	    return new BCryptPasswordEncoder();
//	}
//
//	/**
//     * Defines the security filter chain for HTTP requests.
//     */
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//            .csrf().disable()
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/api/signup", "/api/login", "/api/verify-otp").permitAll()
//                .anyRequest().authenticated())
//            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//
//        return http.build();
//    }
//
//    /**
//     * Provides the authentication manager bean from Spring Security.
//     */
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//        return config.getAuthenticationManager();
//    }
//}
