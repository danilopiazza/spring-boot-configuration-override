package io.github.danilopiazza.spring.boot.configuration.override.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.danilopiazza.spring.boot.configuration.override.beans.MyBean;

@Configuration
public class ConfigB extends ConfigA {
    @Bean
    @Override
    public MyBean myBean() {
        return new MyBean("B");
    }
}
