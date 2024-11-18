package com.keyin.repositories;

import com.keyin.entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    List<Tournament> findByLocation(String location);
}

