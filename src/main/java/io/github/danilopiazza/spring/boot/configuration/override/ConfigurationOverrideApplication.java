package io.github.danilopiazza.spring.boot.configuration.override;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.danilopiazza.spring.boot.configuration.override.beans.MyBean;

@SpringBootApplication
public class ConfigurationOverrideApplication {
    @Autowired
    MyBean myBean;

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationOverrideApplication.class, args);
    }
}
