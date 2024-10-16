package com.eventhub.suhail.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventhub.suhail.model.Theme;
import com.eventhub.suhail.repository.ThemeRepo;

@Service
public class ThemeService {
    @Autowired
    ThemeRepo trepo;

    // @SuppressWarnings("null")
    public String addTheme(Theme e) {
        trepo.save(e);
        return "Theme added Successfully";
    }

    // @SuppressWarnings("null")
    public String updateTheme(Theme e) {
        trepo.save(e);
        return "Theme updated succesfully";
    }

    public String deleteTheme(int id) {
        trepo.deleteById(id);
        return "deleted Successfully";
    }

    public List<Theme> showTheme() {
        return trepo.findAll();
    }
}
