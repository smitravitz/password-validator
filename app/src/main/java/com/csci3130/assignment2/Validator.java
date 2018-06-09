package com.csci3130.assignment2;

public class Validator {

    public static int validate(String password) {
        int passCount = 0;
        //1
        if (!password.equals("password")&&!password.equals("PASSWORD"))
            passCount++;
        //2
        if (password.length()>7)
            passCount++;
        //3: at least one special char
        if (password.matches("^.*[^a-zA-Z0-9].*$"))
            passCount++;
        //4: at least one number
        if (password.matches("^.*[0-9].*$"))
            passCount++;
        //5: at least one upper and one lower
        if (password.matches("^.*[a-z].*$") && password.matches("^.*[A-Z].*$"))
            passCount++;
        return passCount;
    }

    public static String validate_rating(int count) {
        String retMsg = "Password Strength:\n";
        if(count==1)
            retMsg+="Minimum";
        else if(count==2)
            retMsg+="Weak";
        else if(count==3)
            retMsg+="OK";
        else if(count==4)
            retMsg+="Good";
        else if(count==5)
            retMsg+="Excellent";
        return retMsg;
    }

}
