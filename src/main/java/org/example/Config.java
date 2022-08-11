package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:app.properties")
public class Config {

    @Bean
    Horse hourse() {
        return new Horse();
    }

    @Bean
    Parrot parrot() {
        return new Parrot();
    }

    @Bean
    Person person() {
        return new Person(hourse());
    }
}
