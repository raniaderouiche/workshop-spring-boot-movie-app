package tn.fsb.aoc.cinemaapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fsb.aoc.cinemaapp.model.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    List<Movie> findMoviesByCategory(String name);
}
