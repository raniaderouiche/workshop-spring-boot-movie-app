package tn.fsb.aoc.cinemaapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.fsb.aoc.cinemaapp.model.Director;
import tn.fsb.aoc.cinemaapp.services.DirectorService;

import java.util.List;

@RestController
@RequestMapping("/directors")
public class DirectorController {
    
    @Autowired
    private DirectorService DirectorService;

    @GetMapping("/all")
    public List<Director> getAllDirectors(){
        return DirectorService.getAllDirectors();
    }

    @PostMapping("/")
    public void saveDirector(@RequestBody Director director){
        DirectorService.saveDirector(director);
    }

    @DeleteMapping("/{id}")
    public void deleteDirectorById(@PathVariable Long id){
        DirectorService.deleteDirectorById(id);
    }
}
