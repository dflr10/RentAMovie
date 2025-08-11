package net.danielfelipe.projects.RentAMovie.persistence.repository;

import net.danielfelipe.projects.RentAMovie.persistence.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCrudRepository extends JpaRepository<Movie, Long> {
}
