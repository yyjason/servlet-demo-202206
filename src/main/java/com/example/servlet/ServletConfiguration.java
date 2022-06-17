package com.example.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfiguration {

    @Bean
    public ExmpleServlet mainServletBean(){
        ExmpleServlet exmpleServlet = new ExmpleServlet();
        return exmpleServlet;
    }

    @Bean
    public ServletRegistrationBean mainServletRegistration(){
        ServletRegistrationBean servletRegistration = new ServletRegistrationBean(mainServletBean());
        servletRegistration.getUrlMappings().clear();
        servletRegistration.addUrlMappings("/*");
        return servletRegistration;
    }
}
