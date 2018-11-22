package com.clydezhou.spring.springboot.demo.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.clydezhou.spring.springboot.demo.ssm.interceptor.LoginInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public LoginInterceptor loginInterceptor() {
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        return loginInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.loginInterceptor()).addPathPatterns("/**");
    }
}
