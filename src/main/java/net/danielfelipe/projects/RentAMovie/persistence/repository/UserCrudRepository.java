package net.danielfelipe.projects.RentAMovie.persistence.repository;

import net.danielfelipe.projects.RentAMovie.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;
import java.util.Optional;

public interface UserCrudRepository extends JpaRepository<User, Long> {

    //User methods
    List<User> findByNameContaining(String name);

    Optional<User> findByUsername(String username);

    @Modifying
    int deleteByUsername (String username);
}
