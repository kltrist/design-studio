package by.grsu.designstudio.service;

import by.grsu.designstudio.portfolio.domain.PortfolioItem;

import java.io.IOException;
import java.util.List;

public interface PortfolioService {

    List<PortfolioItem> getAll();

    PortfolioItem getById(String id);

    String save(PortfolioItem portfolioItem) throws IOException;

}
