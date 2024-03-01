package com.hw3.hw3.Repository.implementations;

import com.hw3.hw3.Repository.abstractions.LanguageRepository;
import com.hw3.hw3.Entities.Languages;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
@Repository
public class LanguageRepositoryImpl implements LanguageRepository {

    private final List<Languages> languages = new ArrayList<>();

    public LanguageRepositoryImpl() {
        languages.add(new Languages("c#", 1));
        languages.add(new Languages("java", 2));
        languages.add(new Languages("python", 3));
    }

    @Override
    public Languages addLanguage(Languages language) {
        languages.add(language);
        return language;
    }

    @Override
    public Languages updateLanguage(Languages language) {
        for (Languages l : languages) {
            if (l.getId() == language.getId()) {
                l.setName(language.getName());
                return l;
            }
        }
        return language;
    }

    @Override
    public Languages deleteLanguage(int id) {
        for (Languages l : languages) {
            if (l.getId() == id) {
                languages.remove(l);
                return l;
            }
        }
        return null;
    }

    @Override
    public Languages getLanguage(int id) {
        for (Languages l : languages) {
            if (l.getId() == id) {
                return l;
            }
        }
        return null;
    }

    @Override
    public List<Languages> getAllLanguages() {
        return languages;
    }

    @Override
    public boolean isLanguageExists(String name) {
        for (Languages l : languages) {
            if (l.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
