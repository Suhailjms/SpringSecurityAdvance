package com.eventhub.suhail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
// import lombok.RequiredArgsConstructor;

import com.eventhub.suhail.model.Theme;
import com.eventhub.suhail.service.ThemeService;

@RestController
// @RequiredArgsConstructor
@Tag(name = "Theme Controller")
public class ThemeController {
    @Autowired
    ThemeService ts;

    @PostMapping("/addTheme")
    public String addTheme(@RequestBody Theme p) {
        return ts.addTheme(p);
    }

    @GetMapping("/showThemes")
    public List<Theme> showTheme() {
        return ts.showTheme();
    }

    @PutMapping("/updateTheme")
    public String updateTheme(@RequestBody Theme e) {
        return ts.updateTheme(e);
    }

    @DeleteMapping("/deleteTheme/{id}")
    public String deleteTheme(@PathVariable int id) {
        return ts.deleteTheme(id);

    }
}