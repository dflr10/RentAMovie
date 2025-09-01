package net.danielfelipe.projects.RentAMovie.service;

import net.danielfelipe.projects.RentAMovie.persistence.entity.User;

import java.util.List;

public interface UserService {

    //User services
    List<User> findAll();

    List<User> findAllByName(String name);

    User findOneByUsername(String username);

    User saveOne(User user);

    User updateOneByUsername( String username, User user);

    void deleteOneByUsername( String username);

}
