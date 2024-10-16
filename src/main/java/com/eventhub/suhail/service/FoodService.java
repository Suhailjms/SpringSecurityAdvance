package com.eventhub.suhail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventhub.suhail.model.Food;
import com.eventhub.suhail.repository.FoodRepo;

@Service
public class FoodService {
     @Autowired
     FoodRepo frepo;

     public String addfoods(Food e){
        frepo.save(e);
        return "Food added Successfully";
     }
     public String updatefoods(Food e){
      frepo.save(e);
      return "food updated successfully";
     }
     public String deletefoods(int id){
      frepo.deleteById(id);
      return "deleted Successfully";
     }
     public List<Food> showfoods(){
      return frepo.findAll();
     }
     public List<Food>showfoodsbycuisine(String cuisine){
      return frepo.findByCuisine(cuisine);
     }
}