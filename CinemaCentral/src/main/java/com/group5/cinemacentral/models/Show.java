// Show.java
package com.cinemacentral.models;

import java.time.LocalDateTime;

public class Show {
    private Long id;
    private Movie movie;
    private Theater theater;
    private LocalDateTime showTime;

    // Constructors
    public Show() {}

    public Show(Long id, Movie movie, Theater theater, LocalDateTime showTime) {
        this.id = id;
        this.movie = movie;
        this.theater = theater;
        this.showTime = showTime;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }
}
