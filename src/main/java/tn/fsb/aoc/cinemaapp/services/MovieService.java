package tn.fsb.aoc.cinemaapp.services;

import tn.fsb.aoc.cinemaapp.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    void addMovie(Movie movie);
    void deleteMovieById(Long id);

    void setMovieDirector(Long movieId,Long directorId);
}
