package com.techreturners.exercise001;

import java.util.List;
public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase (firstName.charAt(0))+"."+Character.toUpperCase (lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        return Math.round((originalPrice+(originalPrice*(vatRate/100)))*100.0)/100.0;
    }

    public String reverse(String sentence) {
        StringBuilder str = new StringBuilder();
        for(int i=sentence.length()-1;i>=0;i--){
            str = str.append(sentence.charAt(i));
        }
        return str.toString();
    }
    public int countLinuxUsers(List<User> users) {
        int count = 0;
        System.out.println(users.size());
        for(int i=0;i<users.size();i++){
            if(users.get(i).getType().equals("Linux"))
                count++;
        }
        return count;
    }
}
