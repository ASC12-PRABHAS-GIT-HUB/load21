package com.frd.menu;

import com.frd.model.FriendModel;
import com.frd.service.FriendService;
import com.frd.service.FriendServiceImpl;

import java.util.List;
import java.util.Scanner;

public class MenuUI {

    private final FriendService service = new FriendServiceImpl();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        int choice;
        do {
            System.out.println("Friend Management Menu:");
            System.out.println("1 - Add Friend");
            System.out.println("2 - View All Friends");
            System.out.println("3 - Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addFriend();
                    break;
                case 2:
                    listFriends();
                    break;
            }
        } while (choice != 3);
    }

    private void addFriend() {
        System.out.print("Enter Friend ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        FriendModel friend = new FriendModel();
        friend.setFriendId(id);
        friend.setName(name);
        friend.setEmail(email);
        friend.setPhone(phone);

        service.addFriend(friend);
        System.out.println("Friend added successfully.");
    }

    private void listFriends() {
        List<FriendModel> friends = service.getAllFriends();
        if (friends.isEmpty()) {
            System.out.println("No friends found.");
        } else {
            for (FriendModel friend : friends) {
                System.out.println(friend);
            }
        }
    }
}