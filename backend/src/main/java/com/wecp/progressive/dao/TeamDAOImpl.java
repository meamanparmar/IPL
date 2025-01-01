package com.wecp.progressive.dao;
 
import com.wecp.progressive.entity.Team;
import java.sql.SQLException;
import java.util.List;
 
public class TeamDAOImpl implements TeamDAO {
 
    @Override
    public int addTeam(Team team) throws SQLException {
        // Placeholder return
        return -1;
    }
 
    @Override
    public Team getTeamById(int teamId) throws SQLException {
        // Placeholder return
        return null;
    }
 
    @Override
    public void updateTeam(Team team) throws SQLException {
        // No return
    }
 
    @Override
    public void deleteTeam(int teamId) throws SQLException {
        // No return
    }
 
    @Override
    public List<Team> getAllTeams() throws SQLException {
        // Placeholder return
        return null;
    }
}