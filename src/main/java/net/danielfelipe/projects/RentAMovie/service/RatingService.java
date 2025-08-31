package net.danielfelipe.projects.RentAMovie.service;

import net.danielfelipe.projects.RentAMovie.persistence.entity.Movie;
import net.danielfelipe.projects.RentAMovie.persistence.entity.Rating;

import java.util.List;

public interface RatingService {

    //Rating services
    List<Rating> findAll();

    Rating findOneById(Long id);

    List<Rating> findAllByMovieId(Long movieId);

    List<Rating> findAllByUsername(String username);

    Rating createOne(Rating rating);

    Rating updateOneById(Long id, Rating rating);

    void deleteOneBuId(Long id);
}
