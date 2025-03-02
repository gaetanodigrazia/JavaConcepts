package com.digrazia.singleResponsibility.wrongDesign;

public class WrongDesignUser {
        private String name;

        public WrongDesignUser(String name) {
            this.name = name;
        }

        public void saveToDatabase() {
            System.out.println("User saved to database");
        }
}
