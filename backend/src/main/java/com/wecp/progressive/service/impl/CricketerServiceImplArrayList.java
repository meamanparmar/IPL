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
 
public class CricketerServiceImplArrayList {
 
    private List<Cricketer> cricketers;
 
    public CricketerServiceImplArrayList() {
        this.cricketers = new ArrayList<>();
    }
 
    public List<Cricketer> getAllCricketers() {
        return cricketers;
    }
 
    public Cricketer getCricketerById(int cricketerId) {
        for (Cricketer cricketer : cricketers) {
            if (cricketer.getCricketerId() == cricketerId) {
                return cricketer;
            }
        }
        return null; // Return null if no cricketer is found
    }
 
    public Integer addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
        return cricketer.getCricketerId();
    }
 
    public List<Cricketer> getAllCricketersSortedByExperience() {
        cricketers.sort((c1, c2) -> Integer.compare(c2.getExperience(), c1.getExperience()));
        return cricketers;
    }
 
    public void deleteCricketer(int cricketerId) {
        cricketers.removeIf(cricketer -> cricketer.getCricketerId() == cricketerId);
    }
    public List<Cricketer> getCricketersSortedByExperience(){
        cricketers.sort(((Cricketer) cricketers).compareByExperience());
        return cricketers;
    }
}