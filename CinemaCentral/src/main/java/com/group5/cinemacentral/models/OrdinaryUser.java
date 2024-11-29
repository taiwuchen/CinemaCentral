package com.group5.cinemacentral.models;

public class OrdinaryUser extends User {
    public OrdinaryUser(Long id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("OrdinaryUser Notification: " + message);
    }
}
