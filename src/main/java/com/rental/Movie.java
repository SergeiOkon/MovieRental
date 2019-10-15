package com.rental;

import com.factory.audio.Audio;
import com.factory.subtitles.Subtitle;

public class Movie {

    private int id = 1;
    private double cost;
    private String title;
    private Audio audio;
    private Subtitle subtitle;

    public Movie(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }

    public Movie(String title, double cost, Audio audio, Subtitle subtitle) {
        this.title = title;
        this.cost = cost;
        this.audio = audio;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        if(audio == null && subtitle == null){
            return id + ". Movie title: '" + title + '\'' +
                    ", cost: " + cost + "$";
        }
        return "Movie title: '" + title + '\'' +
                ", cost: " + cost + "$" +
                ", audio language: " + audio +
                ", subtitle language: " + subtitle +
                ';';
    }
}
