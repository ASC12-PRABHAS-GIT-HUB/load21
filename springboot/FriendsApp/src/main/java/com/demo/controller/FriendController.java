package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("friends")
public class FriendController {
    private final FriendService friendService;
    @Autowired
    public FriendController(FriendService friendService){
        this.friendService=friendService;
    }
    
}
