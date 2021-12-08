package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1));
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        System.out.println(Character.toUpperCase (firstName.charAt(0))+"." +Character.toUpperCase (lastName.charAt(0)));
        return Character.toUpperCase (firstName.charAt(0))+"."+Character.toUpperCase (lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        System.out.println(Math.round((originalPrice+(originalPrice*(vatRate/100)))*100.0)/100.0);
        return Math.round((originalPrice+(originalPrice*(vatRate/100)))*100.0)/100.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuilder str = new StringBuilder();
        for(int i=sentence.length()-1;i>=0;i--){
            str = str.append(sentence.charAt(i));
        }
        System.out.println(str);
        return str.toString();
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return users.size();
    }
}
