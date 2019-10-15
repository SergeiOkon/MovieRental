package com.factory.subtitles;

public class Subtitle {

    private String subtitleLanguage;

    public Subtitle(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    @Override
    public String toString() {
        return subtitleLanguage;
    }
}
