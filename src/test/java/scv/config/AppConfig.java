package scv.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import scv.parsers.PsvParser;

@Configuration
@Profile({"test", "dev", "int"})
@ComponentScan("scv")
public class AppConfig extends EnvironmentConfig {
    @Autowired
    Environment environment;

    @Bean
    public String getCustomerData() {
        return getStringProperty("testdata.location");
    }

    @Bean
    public PsvParser PsvParser() {
        return new PsvParser();
    }
}
