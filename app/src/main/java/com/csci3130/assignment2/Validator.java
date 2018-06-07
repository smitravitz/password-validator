package com.csci3130.assignment2;

public class Validator {

    public static void Validate(int count) {
        System.out.print("Password Strength: ");
        if(count==0)
            System.out.println("Weak");
        else if(count==1)
            System.out.println("OK");
        else if(count==2)
            System.out.println("Good");

    }

}
