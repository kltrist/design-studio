package by.grsu.designstudio.config;

import by.grsu.designstudio.consultation.SupportChatConfig;
import by.grsu.designstudio.exception.ExceptionConfig;
import by.grsu.designstudio.portfolio.PortfolioConfig;
import by.grsu.designstudio.security.SecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SecurityConfig.class,
        ExceptionConfig.class,
        WebSocketConfig.class,
        SupportChatConfig.class,
        PortfolioConfig.class})
public class AppConfig {

}
