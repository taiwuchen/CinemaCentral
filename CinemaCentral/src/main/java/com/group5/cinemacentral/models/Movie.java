package com.group5.cinemacentral.models;

import java.util.List;

public class Movie {
    private Long id;
    private String title;
    private String director;
    private List<ShowTime> showTimes;

    public Movie(Long id, String title, String director, List<ShowTime> showTimes) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.showTimes = showTimes;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<ShowTime> getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(List<ShowTime> showTimes) {
        this.showTimes = showTimes;
    }
}