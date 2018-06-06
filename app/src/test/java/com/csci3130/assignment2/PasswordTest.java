package com.csci3130.assignment2;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)

public class PasswordTest {

    String pw = "passingExample";
    static int c = 0;

    @Test
    public void not_password() {
        Assert.assertNotEquals("password", pw);
        Assert.assertNotEquals("PASSWORD", pw);
        c++;
    }
    @Test
    public void min_length() {
        Assert.assertTrue(pw.length()>7);
        c++;
    }
    @AfterClass
    public static void num_tests_passed(){
        System.out.println(c);
    }

}