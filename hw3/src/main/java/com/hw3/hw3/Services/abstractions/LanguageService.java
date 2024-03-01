package com.hw3.hw3.Services.abstractions;

import com.hw3.hw3.Entities.Languages;

import java.util.List;

public interface LanguageService {
    Languages addLanguage(Languages language);
    Languages updateLanguage(Languages language);
    void deleteLanguage(int id);
    Languages getLanguage(int id);
    List<Languages> getAllLanguages();

}
