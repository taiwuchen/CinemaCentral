package com.group5.cinemacentral.models;

import java.time.LocalDateTime;

public class ShowTime {
    private Long id;
    private LocalDateTime startTime;

    public ShowTime(Long id, LocalDateTime startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}