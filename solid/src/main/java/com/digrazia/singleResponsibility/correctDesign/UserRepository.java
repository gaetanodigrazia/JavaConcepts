package com.digrazia.singleResponsibility.correctDesign;

public class UserRepository {

    public User saveToDatabase(User user) {
        System.out.println("User saved to database");
        return user;
    }
}
