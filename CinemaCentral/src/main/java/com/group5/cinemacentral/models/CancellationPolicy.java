package com.group5.cinemacentral.models;

import java.time.LocalDateTime;

public class CancellationPolicy {
    private int cancellationHours; // Number of hours before the show to allow cancellation

    public CancellationPolicy(int cancellationHours) {
        this.cancellationHours = cancellationHours;
    }

    public boolean canCancel(Ticket ticket) {
        LocalDateTime now = LocalDateTime.now();
        return now.isBefore(ticket.getShowTime().getStartTime().minusHours(cancellationHours));
    }

    // Getters and Setters
    public int getCancellationHours() {
        return cancellationHours;
    }

    public void setCancellationHours(int cancellationHours) {
        this.cancellationHours = cancellationHours;
    }
}
