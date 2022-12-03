package tn.fsb.aoc.cinemaapp.services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fsb.aoc.cinemaapp.model.Director;
import tn.fsb.aoc.cinemaapp.repositories.DirectorRepository;
import tn.fsb.aoc.cinemaapp.services.DirectorService;

import java.util.List;

@Service
@AllArgsConstructor
public class DirectorServiceImpl implements DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    @Override
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    @Override
    public void saveDirector(Director director) {
        directorRepository.save(director);
    }

    @Override
    public void deleteDirectorById(Long id) {
        directorRepository.deleteById(id);
    }
}
