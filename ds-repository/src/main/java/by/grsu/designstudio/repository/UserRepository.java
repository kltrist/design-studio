package by.grsu.designstudio.repository;

import by.grsu.designstudio.portfolio.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    Optional<User> getByUsername(final String username);
}
