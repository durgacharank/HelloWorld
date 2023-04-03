package com.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication(scanBasePackages = {"com.HelloWorld"})
public class HelloWorldApplication extends SpringBootServletInitializer implements WebApplicationInitializer
{
    // extends SpringBootServletInitializer implements WebApplicationInitializer
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
//    {
//        return application.sources(com.HelloWorld.Controllers.HelloWorldApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}