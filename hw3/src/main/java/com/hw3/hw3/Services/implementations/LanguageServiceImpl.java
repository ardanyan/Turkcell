package com.hw3.hw3.Services.implementations;

import com.hw3.hw3.Entities.Languages;
import com.hw3.hw3.Repository.abstractions.LanguageRepository;
import com.hw3.hw3.Services.abstractions.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public Languages addLanguage(Languages language) {
        //names should be unique
        //names should not be empty

        if(language == null) {
            throw new RuntimeException("Language not found");
        }

        if (language.getName().isEmpty()) {
            throw new RuntimeException("Language name cannot be empty");
        }

        //check if language already exists
        if (languageRepository.isLanguageExists(language.getName())) {
            throw new RuntimeException("Language already exists");
        }
        else {
            return languageRepository.addLanguage(language);
        }

    }

    @Override
    public Languages updateLanguage(Languages language) {
        return null;
    }

    @Override
    public void deleteLanguage(int id) {

    }

    @Override
    public Languages getLanguage(int id) {
        return null;
    }

    @Override
    public List<Languages> getAllLanguages() {
        return null;
    }
}
