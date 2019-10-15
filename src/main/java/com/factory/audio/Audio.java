package com.factory.audio;

public class Audio {

    private String audioLanguage;

    public Audio(String audioLanguage) {
        this.audioLanguage = audioLanguage;
    }

    @Override
    public String toString() {
        return audioLanguage;
    }
}
