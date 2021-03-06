package by.grsu.designstudio.portfolio.controller;

import by.grsu.designstudio.portfolio.PortfolioService;
import by.grsu.designstudio.portfolio.domain.PortfolioItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("portfolio")
public class PortfolioController {

    @Autowired
    PortfolioService portfolioService;

    @GetMapping("/{id}")
    public PortfolioItem getPortfolioById(@PathVariable String id) {
        return portfolioService.getById(id);
    }

    @GetMapping
    public List<PortfolioItem> getAllPortfolios() {
        return portfolioService.getAll();
    }

    @PostMapping
    public String save(PortfolioItem portfolioItem) {
        return portfolioService.save(portfolioItem);
    }


}
