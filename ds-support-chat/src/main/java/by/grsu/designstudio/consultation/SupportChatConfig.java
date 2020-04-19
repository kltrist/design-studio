package by.grsu.designstudio.consultation;

import by.grsu.designstudio.consultation.controller.ChatController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {ChatController.class})
public class SupportChatConfig {
}
