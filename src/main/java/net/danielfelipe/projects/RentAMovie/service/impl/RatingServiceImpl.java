package net.danielfelipe.projects.RentAMovie.service.impl;

import net.danielfelipe.projects.RentAMovie.exception.ObjectNotFoundException;
import net.danielfelipe.projects.RentAMovie.persistence.entity.Rating;
import net.danielfelipe.projects.RentAMovie.persistence.repository.RatingCrudRepository;
import net.danielfelipe.projects.RentAMovie.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingCrudRepository ratingCrudRepository;

    @Override
    public List<Rating> findAll() {
        return ratingCrudRepository.findAll();
    }

    @Override
    public Rating findOneById(Long id) {
        return ratingCrudRepository.findById(id)
                .orElseThrow(()-> new ObjectNotFoundException("[rating:"+ Long.toString(id)+"]"));
    }

    @Override
    public List<Rating> findAllByMovieId(Long movieId) {
        return ratingCrudRepository.findByMovieId(movieId);
    }

    @Override
    public List<Rating> findAllByUsername(String username) {
        return ratingCrudRepository.findByUserUsername(username);
    }

    @Override
    public Rating createOne(Rating rating) {
        return ratingCrudRepository.save(rating);
    }

    @Override
    public Rating updateOneById(Long id, Rating rating) {
        Rating oldRating = this.findOneById(id);
        oldRating.setUserId(rating.getUserId());
        oldRating.setMovieId(rating.getMovieId());

        return ratingCrudRepository.save(oldRating);
    }

    @Override
    public void deleteOneBuId(Long id) {
        if (ratingCrudRepository.existsById(id)){
            ratingCrudRepository.deleteById(id);
            return;
        }
        throw new ObjectNotFoundException("[rating:"+ Long.toString(id)+"]");
    }
}
