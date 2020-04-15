package by.grsu.designstudio;

import by.grsu.designstudio.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class DesignStudioApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignStudioApplication.class, args);
    }

}
