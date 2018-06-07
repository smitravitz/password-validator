package com.csci3130.assignment2;

public class Validator {

    public static void Validate(int count) {
        System.out.print("Password Strength: ");
        if(count==0|count==1)
            System.out.println("Awful");
        else if(count==2|count==3)
            System.out.println("Poor");
        else if(count==4)
            System.out.println("Not good");
        else if(count==5)
            System.out.println("Good");
    }
}
