package net.danielfelipe.projects.RentAMovie.service;

import net.danielfelipe.projects.RentAMovie.persistence.entity.Movie;
import net.danielfelipe.projects.RentAMovie.util.MovieGenre;

import java.util.List;

public interface MovieService {

    //Movie services
    List<Movie> findAll();

    List<Movie> findAllByTitle(String title);

    List<Movie> findAllByGenre(MovieGenre genre);

    List<Movie> findAllByGenreAndTitle(MovieGenre genre, String title);

    Movie findOneById(Long id);

    Movie createOne(Movie movie);

    Movie updateOneById(Long id, Movie movie);

    void deleteOneById(Long id);
}
