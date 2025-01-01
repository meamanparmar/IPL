package com.wecp.progressive.service.impl;

// package com.wecp.progressive.service;
 
import com.wecp.progressive.dao.MatchDAO;
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

import java.util.List;
 
public class MatchServiceImplJdbc implements MatchService {
 
    private final MatchDAO matchDAO;
 
    public MatchServiceImplJdbc(MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }
 
    @Override
    public List<Match> getAllMatches() {
        // Placeholder return
        return null;
    }
 
    @Override
    public Match getMatchById(int matchId) {
        // Placeholder return
        return null;
    }
 
    @Override
    public Integer addMatch(Match match) {
        // Placeholder return
        return -1;
    }
 
    @Override
    public void updateMatch(Match match) {
        // No return
    }
 
    @Override
    public void deleteMatch(int matchId) {
        // No return
    }
 
    // Skipping getAllMatchesByStatus as per the instructions
}