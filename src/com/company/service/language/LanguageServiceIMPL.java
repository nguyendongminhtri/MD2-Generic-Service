package com.company.service.language;

import com.company.model.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageServiceIMPL implements ILanguageService{
    public static List<Language> languageList = new ArrayList<>();
    static {
        languageList.add(new Language(1,"JAVA"));
        languageList.add(new Language(2,"PHP"));
    }
    @Override
    public List<Language> findAll() {
        return languageList;
    }

    @Override
    public void save(Language language) {
        languageList.add(language);
    }

    @Override
    public void deleteById(int id) {
        languageList.remove(id);
    }
}
