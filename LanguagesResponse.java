package com.example.translateazure;

import java.util.Map;

public class LanguagesResponse {
    Map<String, Language> translation;

    @Override
    public String toString() {
        // перечень языков объединяем в одну строку
        String  languages = "";
        for (String l: translation.keySet()) {
            languages += l + ":";
        }
        return languages;
    }
}
