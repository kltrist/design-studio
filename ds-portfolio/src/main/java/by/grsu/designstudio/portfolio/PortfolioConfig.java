package by.grsu.designstudio.portfolio;

import by.grsu.designstudio.portfolio.controller.PortfolioController;
import by.grsu.designstudio.portfolio.service.PortfolioServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {PortfolioController.class, PortfolioServiceImpl.class})
public class PortfolioConfig {
}
