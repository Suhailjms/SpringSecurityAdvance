package com.eventhub.suhail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventhub.suhail.model.Venue;
import com.eventhub.suhail.repository.VenueRepo;


@Service
public class VenueService {
    @Autowired
    VenueRepo vdrepo;
   
    // @Autowired
    // UsersRepository urepo;

    public String addVenue(Venue e) {
        vdrepo.save(e);
        return "Event added Successfully";
    }

    public String updateVenue(Venue e) {
        vdrepo.save(e);
        return "event updated succesfully";
    }

    public String deleteVenue(int id) {
        vdrepo.deleteById(id);
        return "deleted Successfully";

    }

    public List<Venue> showVenues() {
        return vdrepo.findAll();
    }
   
}