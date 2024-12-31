package com.wecp.progressive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Cricketer;

public class CricketerDAOImpl implements CricketerDAO{

    @Override
    public int addCricketer(Cricketer cricketer) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        int generatedID=-1;
        try{
            connection = DatabaseConnectionManager.getConnection();
            String sql =  "INSERT INTO cricketer (cricketer_id , team_id , cricketer_name , age,nationality,experience,role,total_runs,total_wickets) VALUES(?,?,?,?,?,?,?,?,?)";
            statement=connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1,cricketer.getTeamById());
            

        }
    }

    @Override
    public int addCricketer(Cricketer cricketer) {
        return -1;
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        return null;
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        
    }

    @Override
    public void deleteCricketer(int cricketerId) {
       
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        return null;
    }

}
