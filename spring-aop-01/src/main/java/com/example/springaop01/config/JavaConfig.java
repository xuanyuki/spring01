package com.example.springaop01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.springaop01")
@EnableAspectJAutoProxy
public class JavaConfig {

}
