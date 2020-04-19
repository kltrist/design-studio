package by.grsu.designstudio.config;

import by.grsu.designstudio.consultation.SupportChatConfig;
import by.grsu.designstudio.exception.ExceptionConfig;
import by.grsu.designstudio.portfolio.controller.ControllerConfig;
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
        ExceptionConfig.class,
        WebSocketConfig.class,
        SupportChatConfig.class})

public class AppConfig {

}
