package com.hw3.hw3.Repository.abstractions;

import com.hw3.hw3.Entities.Languages;

import java.util.List;

public interface LanguageRepository {
    Languages addLanguage(Languages language);
    Languages updateLanguage(Languages language);
    Languages deleteLanguage(int id);
    Languages getLanguage(int id);
    List<Languages> getAllLanguages();

    boolean isLanguageExists(String Id);

}
