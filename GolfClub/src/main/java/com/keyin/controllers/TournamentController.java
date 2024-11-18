package com.keyin.controllers;

import com.keyin.entities.Member;
import com.keyin.entities.Tournament;
import com.keyin.services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);
    }

    @GetMapping("/{id}/members")
    public List<Member> getTournamentMembers(@PathVariable Long id) {
        Tournament tournament = tournamentService.getTournamentById(id);
        return tournament.getParticipatingMembers();
    }

    @GetMapping("/search")
    public List<Tournament> searchTournaments(@RequestParam String location) {
        return tournamentService.searchTournamentsByLocation(location);
    }
}



