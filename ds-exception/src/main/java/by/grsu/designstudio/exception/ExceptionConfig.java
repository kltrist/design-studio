package by.grsu.designstudio.exception;

import by.grsu.designstudio.exception.controller.GlobalControllerAdvice;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = GlobalControllerAdvice.class)
public class ExceptionConfig {
}
