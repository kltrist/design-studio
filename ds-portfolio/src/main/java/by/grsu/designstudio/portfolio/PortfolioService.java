package by.grsu.designstudio.portfolio;


import by.grsu.designstudio.portfolio.domain.PortfolioItem;

import java.util.List;

public interface PortfolioService {

    List<PortfolioItem> getAll();

    PortfolioItem getById(String id);

    String save(PortfolioItem portfolioItem);

}
