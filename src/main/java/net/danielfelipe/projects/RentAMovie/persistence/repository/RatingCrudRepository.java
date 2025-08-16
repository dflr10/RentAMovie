package net.danielfelipe.projects.RentAMovie.persistence.repository;

import net.danielfelipe.projects.RentAMovie.persistence.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingCrudRepository extends JpaRepository<Rating, Long> {

    //Rating methods
    List<Rating> findByMovieId(Long id);

    List<Rating> findByUserUsername(String username);
}
