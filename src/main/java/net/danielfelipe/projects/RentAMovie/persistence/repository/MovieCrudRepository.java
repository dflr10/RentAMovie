package net.danielfelipe.projects.RentAMovie.persistence.repository;

import net.danielfelipe.projects.RentAMovie.persistence.entity.Movie;
import net.danielfelipe.projects.RentAMovie.util.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieCrudRepository extends JpaRepository<Movie, Long> {

    //Movie methods
    List<Movie> findByTitleContaining(String title);

    List<Movie> findByGenre(MovieGenre genre);

    List<Movie> findByGenreAndTitleContaining(MovieGenre genre, String title);


}
