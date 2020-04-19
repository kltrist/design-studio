package by.grsu.designstudio.portfolio.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = UserController.class)
public class ControllerConfig {
}
