package by.grsu.designstudio.service.impl;

import by.grsu.designstudio.exception.domain.ObjectNotFoundException;
import by.grsu.designstudio.portfolio.domain.PortfolioItem;
import by.grsu.designstudio.repository.PortfolioRepository;
import by.grsu.designstudio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
@Transactional
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    PortfolioRepository portfolioRepository;

    @Override
    public String save(PortfolioItem portfolioItem) throws IOException {
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
