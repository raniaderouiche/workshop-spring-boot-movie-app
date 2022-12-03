package tn.fsb.aoc.cinemaapp.services;

import tn.fsb.aoc.cinemaapp.model.Director;

import java.util.List;

public interface DirectorService {
    List<Director> getAllDirectors();
    void saveDirector(Director director);
    void deleteDirectorById(Long id);
}
