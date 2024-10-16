package com.eventhub.suhail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eventhub.suhail.model.Food;


@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {
    @Query("SELECT e FROM Food e WHERE e.food_cuisine = :cuisine")
    List<Food> findByCuisine(String cuisine);
}