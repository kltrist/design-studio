package by.grsu.designstudio.service.impl;

import by.grsu.designstudio.portfolio.domain.User;
import by.grsu.designstudio.repository.UserRepository;
import by.grsu.designstudio.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
