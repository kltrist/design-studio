package by.grsu.designstudio.portfolio.domain.repo;

import by.grsu.designstudio.portfolio.domain.PortfolioItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PortfolioRepository extends MongoRepository<PortfolioItem, String> {
}