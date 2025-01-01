package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArrayList {
 
    private List<Team> teams;
 
    public TeamServiceImplArrayList() {
        this.teams = new ArrayList<>();
    }
 
    public List<Team> getAllTeams() {
        return teams;
    }
 
    public Team getTeamById(int teamId) {
        for (Team team : teams) {
            if (team.getTeamId() == teamId) {
                return team;
            }
        }
        return null; // Return null if no team is found
    }
 
    public Integer addTeam(Team team) {
        teams.add(team);
        return team.getTeamId();
    }
 
    public void updateTeam(Team updatedTeam) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getTeamId() == updatedTeam.getTeamId()) {
                teams.set(i, updatedTeam);
                return;
            }
        }
    }
 
    public void deleteTeam(int teamId) {
        teams.removeIf(team -> team.getTeamId() == teamId);
    }
    public List<Team> getTeamsSortedByName(){
        Collections.sort(teams);
        return teams;
    }
}
