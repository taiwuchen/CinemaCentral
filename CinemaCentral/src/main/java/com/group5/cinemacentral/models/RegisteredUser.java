package com.group5.cinemacentral.models;

public class RegisteredUser extends User {
    private String membershipId;

    public RegisteredUser(Long id, String name, String email, String membershipId) {
        super(id, name, email);
        this.membershipId = membershipId;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("RegisteredUser Notification: " + message);
    }
}