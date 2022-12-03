package tn.fsb.aoc.cinemaapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.fsb.aoc.cinemaapp.model.Movie;
import tn.fsb.aoc.cinemaapp.services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    public MovieService movieService;

    @GetMapping("/all")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @PostMapping("/")
    public void saveMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovieById(@PathVariable Long id){
        movieService.deleteMovieById(id);
    }

    @PatchMapping("/{movieId}/set-director")
    public void setMovieDirector(@PathVariable Long movieId,@RequestParam Long directorId){
        movieService.setMovieDirector(movieId,directorId);
    }
}
