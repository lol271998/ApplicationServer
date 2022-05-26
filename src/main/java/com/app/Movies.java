package com.app;

public class Movies {
    private String title;
    private int release_year;
    private String[] genre;
    private int duration;
    private String link;

    public Movies(String title, int release_year, String[] genre, int duration, String link) {
        this.title = title;
        this.release_year = release_year;
        this.genre = genre;
        this.duration = duration;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public String[] getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public String getLink() {
        return link;
    }
}
