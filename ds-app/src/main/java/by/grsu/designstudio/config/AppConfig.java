package by.grsu.designstudio.config;

import by.grsu.designstudio.controller.ControllerConfig;
import by.grsu.designstudio.repository.RepositoryConfig;
import by.grsu.designstudio.service.ServiceConfig;
import by.grsu.designstudio.security.SecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ControllerConfig.class,
        ServiceConfig.class,
        RepositoryConfig.class,
        SecurityConfig.class})
public class AppConfig {
}
