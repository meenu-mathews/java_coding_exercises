package com.techreturners.exercise005;
public class Exercise005 {

    public boolean isPangram(String input) {
        if (input == null || input.isEmpty())
            return false;
        long c = input.toLowerCase().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count();

        if (c == 26)
            return true;

        return false;
    }
}
