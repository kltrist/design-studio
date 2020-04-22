package by.grsu.designstudio.portfolio.service;

import by.grsu.designstudio.exception.domain.ObjectNotFoundException;
import by.grsu.designstudio.portfolio.PortfolioService;
import by.grsu.designstudio.portfolio.domain.PortfolioItem;
import by.grsu.designstudio.portfolio.domain.repo.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    PortfolioRepository portfolioRepository;

    @Override
    public String save(PortfolioItem portfolioItem) {
        final PortfolioItem savedItem = portfolioRepository.save(portfolioItem);
        return savedItem.getId();
    }

    @Override
    public List<PortfolioItem> getAll() {
        return portfolioRepository.findAll();
    }

    @Override
    public PortfolioItem getById(String id) {
        return portfolioRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("id=" + id));
    }


}
