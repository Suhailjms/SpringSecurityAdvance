package com.eventhub.suhail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventhub.suhail.model.Venue;

@Repository
public interface VenueRepo extends JpaRepository<Venue, Integer> {

}