package com.hw3.hw3.Controller;

import com.hw3.hw3.Entities.Languages;
import com.hw3.hw3.Services.abstractions.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/language")
public class LanguageController {
    LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/add")
    public Languages addLanguage(@RequestBody Languages language) {
        return languageService.addLanguage(language);
    }

    @PutMapping("/update/id/{id}")
    public Languages updateLanguage(@PathVariable int id, @RequestBody Languages language) {
        return languageService.updateLanguage(language);
    }

    @GetMapping("/get/id/{id}")
    public Languages getLanguage(@PathVariable int id , @RequestBody Languages language) {
        return languageService.getLanguage(id);
    }

    @GetMapping("/get/all")
    public List<Languages> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @DeleteMapping("/delete/id/{id}")
    public void deleteLanguage(@PathVariable int id , @RequestBody Languages language) {
        languageService.deleteLanguage(id);
    }


}
