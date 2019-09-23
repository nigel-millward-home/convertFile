package scv.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public abstract class EnvironmentConfig {
    @Autowired
    Environment environment;

    EnvironmentConfig() {
        String property = System.getProperty("spring.profiles.active");

        if (StringUtils.isEmpty(property)) {
            throw new IllegalArgumentException("Invalid spring.profiles.active:" + property);
        }
    }

    public String getStringProperty(String propertyName) {
        return environment.getProperty(propertyName);
    }


}
