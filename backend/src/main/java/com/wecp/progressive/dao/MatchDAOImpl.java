package com.wecp.progressive.dao;
 
import com.wecp.progressive.entity.Match;
import java.sql.SQLException;
import java.util.List;
 
public class MatchDAOImpl implements MatchDAO {
 
    @Override
    public int addMatch(Match match) throws SQLException {
        // Placeholder return
        return -1;
    }
 
    @Override
    public Match getMatchById(int matchId) throws SQLException {
        // Placeholder return
        return null;
    }
 
    @Override
    public void updateMatch(Match match) throws SQLException {
        // No return
    }
 
    @Override
    public void deleteMatch(int matchId) throws SQLException {
        // No return
    }
 
    @Override
    public List<Match> getAllMatches() throws SQLException {
        // Placeholder return
        return null;
    }
}