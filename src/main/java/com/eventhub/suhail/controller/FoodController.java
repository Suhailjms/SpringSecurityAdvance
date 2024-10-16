package com.eventhub.suhail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.tags.Tag;
import com.eventhub.suhail.model.Food;
import com.eventhub.suhail.service.FoodService;

@RestController
@Tag(name="Food Controller")
public class FoodController {
  @Autowired
  FoodService foodservice;

  @GetMapping("/showFoods")
  public  List<Food> showFoods(){
    return foodservice.showfoods();
  }

  @GetMapping ("/showFoodsByCuisine/{cuisine}")
  public List<Food> showFoodsByCuisine(@PathVariable String cuisine){
    return foodservice.showfoodsbycuisine(cuisine);
  }

  @PostMapping("/addFoods")
  public String addFoods(@RequestBody Food e){
    return foodservice.addfoods(e);
  }
  @PutMapping("/updateFoods")
  public String updateFoods(@RequestBody Food e){
    return foodservice.updatefoods(e);
  }
  @DeleteMapping("/deleteFoods/{id}")
  public String deleteFoods(@PathVariable int id){
    return foodservice.deletefoods(id);
    
  }
}
