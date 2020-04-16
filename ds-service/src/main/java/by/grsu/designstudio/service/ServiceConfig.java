package by.grsu.designstudio.service;

import by.grsu.designstudio.service.impl.UserServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = UserServiceImpl.class)
public class ServiceConfig {
}
