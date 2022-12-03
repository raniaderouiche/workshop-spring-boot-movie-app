package tn.fsb.aoc.cinemaapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fsb.aoc.cinemaapp.model.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director,Long> {
}
