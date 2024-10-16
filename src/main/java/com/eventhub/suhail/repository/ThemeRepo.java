package com.eventhub.suhail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventhub.suhail.model.Theme;

@Repository
public interface ThemeRepo extends JpaRepository<Theme, Integer> {

}
