package ru.javalang.item10.sample02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.javalang.item10.sample02.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "ru.javalang.item10.aspect01.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

  @Bean
  public LoggingAspect aspect() {
    return new LoggingAspect();
  }
}
