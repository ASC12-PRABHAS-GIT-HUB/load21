package com.frd.repo;


import com.frd.model.FriendModel;
import java.util.List;
public interface FriendReposi {
    void saveFriend(FriendModel friend);
    List<FriendModel> getAllfriends();

    List<FriendModel> getAllFriends();
}
