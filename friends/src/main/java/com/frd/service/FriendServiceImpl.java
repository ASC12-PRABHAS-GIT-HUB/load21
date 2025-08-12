package com.frd.service;

import com.frd.model.FriendModel;
import com.frd.repo.FriendReposi;
import com.frd.repo.FriendRepositoryImpl;

import java.util.List;

public class FriendServiceImpl implements FriendService {

    private final FriendReposi frepo = new FriendRepositoryImpl();

    @Override
    public void addFriend(FriendModel friend) {
        frepo.saveFriend(friend);
    }

    @Override
    public List<FriendModel> getAllFriends() {
        return frepo.getAllFriends();
    }
}
