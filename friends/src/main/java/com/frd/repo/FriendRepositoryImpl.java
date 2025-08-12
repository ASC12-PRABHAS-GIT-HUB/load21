package com.frd.repo;

import com.frd.model.FriendModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FriendRepositoryImpl implements FriendReposi {

    private final Connection connection = DbConnectionSingleton.getInstance();

    @Override
    public void saveFriend(FriendModel friend) {
        String sql = "INSERT INTO friends (friendId, name, email, phone) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, friend.getFriendId());
            ps.setString(2, friend.getName());
            ps.setString(3, friend.getEmail());
            ps.setString(4, friend.getPhone());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error saving friend: " + e.getMessage());
        }
    }

    @Override
    public List<FriendModel> getAllfriends() {
        return Collections.emptyList();
    }

    @Override
    public List<FriendModel> getAllFriends() {
        List<FriendModel> friends = new ArrayList<>();
        String sql = "SELECT * FROM friends";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                FriendModel friend = new FriendModel();
                friend.setFriendId(rs.getString("friendId"));
                friend.setName(rs.getString("name"));
                friend.setEmail(rs.getString("email"));
                friend.setPhone(rs.getString("phone"));
                friends.add(friend);
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving friends: " + e.getMessage());
        }

        return friends;
    }
}
