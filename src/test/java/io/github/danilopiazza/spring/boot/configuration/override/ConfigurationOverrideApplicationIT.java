package io.github.danilopiazza.spring.boot.configuration.override;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigurationOverrideApplicationIT {
    @Autowired
    ConfigurationOverrideApplication application;

    @Test
    void laterConfigurationOverridesEarlierConfiguration() {
        assertEquals("C", application.myBean.getName());
    }
}
