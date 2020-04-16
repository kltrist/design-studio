package by.grsu.designstudio.config;

import by.grsu.designstudio.controller.ControllerConfig;
import by.grsu.designstudio.exception.ExceptionConfig;
import by.grsu.designstudio.repository.RepositoryConfig;
import by.grsu.designstudio.security.SecurityConfig;
import by.grsu.designstudio.service.ServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ControllerConfig.class,
        ServiceConfig.class,
        RepositoryConfig.class,
        SecurityConfig.class,
        ExceptionConfig.class})
public class AppConfig {

}
