package com.frd.model;

public class FriendModel {
    private String friendId;
    private String name;
    private String email;
    private String phone;

    // Getters and Setters
    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Friend ID: " + friendId + ", Name: " + name + ", Email: " + email + ", Phone: " + phone;
    }
}
