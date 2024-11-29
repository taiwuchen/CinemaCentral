// User.java
package com.cinemacentral.models;

public class User {
    private Long userId;
    private String name;
    private String email;
    private int selectedSeats;

    // Constructors, Getters, and Setters
    public User() {}

    public User(Long userId, String name, String email, int selectedSeats) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.selectedSeats = selectedSeats;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSelectedSeats() {
        return selectedSeats;
    }

    public void setSelectedSeats(int selectedSeats) {
        this.selectedSeats = selectedSeats;
    }
}