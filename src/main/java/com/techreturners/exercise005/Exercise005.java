package com.techreturners.exercise005;
public class Exercise005 {

    public boolean isPangram(String input) {
        System.out.println(input.length());
        if(input.length()==0 || input.equals("null"))
            return false;
        for (int i = 0; i < input.length(); i++)
        {
              if(input.matches("^[a-zA-Z]*$"))
                return true;

        }
        return true;
    }

}
