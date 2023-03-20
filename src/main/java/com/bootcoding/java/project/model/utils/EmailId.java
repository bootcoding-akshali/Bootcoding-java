package com.bootcoding.java.project.model.utils;

import java.util.Random;

public class EmailId {
    public class EmailIdGenerator{
        private static final String EMAIL = "@gmail.com";
        private static final Random random = new Random();
        private static final int MIN = 2000;
        private static final int MAX = 2022;

        public  static String getEmailId(String name){
            int randomNumber = random.nextInt(MAX - MIN);
            int year = MIN + randomNumber;
            String emailId = name + year + EMAIL;
            return emailId;

        }

        public static void main(String[] args) {
            EmailIdGenerator.getEmailId(" ");
        }
    }
}
