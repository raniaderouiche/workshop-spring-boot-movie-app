package tn.fsb.aoc.cinemaapp.services.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fsb.aoc.cinemaapp.model.Director;
import tn.fsb.aoc.cinemaapp.model.Movie;
import tn.fsb.aoc.cinemaapp.repositories.DirectorRepository;
import tn.fsb.aoc.cinemaapp.repositories.MovieRepository;
import tn.fsb.aoc.cinemaapp.services.MovieService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    @Autowired
    public MovieRepository movieRepository;

    @Autowired
    public DirectorRepository directorRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public void setMovieDirector(Long movieId,Long directorId) {
        Director director = new Director();
        Movie movie = new Movie();
        if(directorRepository.findById(directorId).isPresent())
            director = directorRepository.findById(directorId).get();

        if(movieRepository.findById(movieId).isPresent())
            movie = movieRepository.findById(movieId).get();

        movie.setDirector(director);
        movieRepository.save(movie);
    }
}
