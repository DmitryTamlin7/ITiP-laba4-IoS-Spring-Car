package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example") // ComponentSсan ищет по классам все бины
public class SpringConfig {
}
