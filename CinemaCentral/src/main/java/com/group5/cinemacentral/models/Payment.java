package com.group5.cinemacentral.models;

public class Payment {
    private Long id;
    private Ticket ticket;
    private String paymentMethod; // e.g., "Credit Card", "PayPal"
    private double amount;

    public Payment(Long id, Ticket ticket, String paymentMethod, double amount) {
        this.id = id;
        this.ticket = ticket;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
