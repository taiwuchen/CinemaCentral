package com.group5.cinemacentral.models;
import com.group5.cinemacentral.models.User;

public class NotificationService {
    public void sendNotification(User user, String message) {
        user.receiveNotification(message);
    }
}