package com.frd.service;

import com.frd.model.FriendModel;

import java.util.List;

public interface FriendService {
        void addFriend(FriendModel friend);
        List<FriendModel> getAllFriends();
    }


