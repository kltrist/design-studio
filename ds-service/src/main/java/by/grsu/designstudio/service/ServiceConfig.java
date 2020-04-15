package by.grsu.designstudio.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = UserServiceImpl.class)
public class ServiceConfig {
}
