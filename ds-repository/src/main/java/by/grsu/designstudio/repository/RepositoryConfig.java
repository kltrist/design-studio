package by.grsu.designstudio.repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = UserRepository.class)
public class RepositoryConfig {
}
