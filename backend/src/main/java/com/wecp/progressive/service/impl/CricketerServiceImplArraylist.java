package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

// public class CricketerServiceImplArraylist implements CricketerService  {

//     @Override
//     public Integer addCricketer(Cricketer cricketer) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void deleteCricketer(int cricketerId) {
//         // TODO Auto-generated method stub
//         CricketerService.super.deleteCricketer(cricketerId);
//     }

//     @Override
//     public void emptyArrayList() {
//         // TODO Auto-generated method stub
//         CricketerService.super.emptyArrayList();
//     }

//     @Override
//     public List<Cricketer> getAllCricketers() {
//         // TODO Auto-generated method stub
//         return List.of();
//     }

//     @Override
//     public List<Cricketer> getAllCricketersSortedByExperience() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Cricketer getCricketerById(int cricketerId) {
//         // TODO Auto-generated method stub
//         return CricketerService.super.getCricketerById(cricketerId);
//     }

//     @Override
//     public List<Cricketer> getCricketersByTeam(int teamId) {
//         // TODO Auto-generated method stub
//         return CricketerService.super.getCricketersByTeam(teamId);
//     }

//     @Override
//     public void updateCricketer(Cricketer cricketer) {
//         // TODO Auto-generated method stub
//         CricketerService.super.updateCricketer(cricketer);
//     }

    

// }


import java.util.ArrayList;
import java.util.List;
 
public class CricketerServiceImplArraylist implements CricketerService {
 
    private List<Cricketer> cricketers = new ArrayList<>();
 
    @Override
    public List<Cricketer> getAllCricketers() {
        return cricketers;
    }
 
    @Override
    public Integer addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
        return cricketer.getCricketerId(); // Assuming Cricketer has a getId() method.
    }
 
    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        // Placeholder for sorting logic
        return cricketers; // Assuming the sorting is done elsewhere.
    }
}