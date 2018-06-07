package com.csci3130.assignment2;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)

public class PasswordTest {

    String pw = "pass%ingEx&am33ple";
    static int c = 0;

    @Test
    public void not_equals_password() {
        Assert.assertNotEquals("password", pw);
        Assert.assertNotEquals("PASSWORD", pw);
        c++;
    }
    @Test
    public void pw_min_length() {
        Assert.assertTrue(pw.length()>7);
        c++;
    }
    @Test
    public void pw_one_special_char() {
        Assert.assertTrue(pw.matches("^.*[^a-zA-Z0-9].*$"));
        c++;
    }
    @Test
    public void pw_one_number() {
        Assert.assertTrue(pw.matches("^.*[0-9].*$"));
        c++;
    }
    @Test
    public void pw_upper_lower() {
        Assert.assertTrue(pw.matches("^.*[a-z].*$") && pw.matches("^.*[A-Z].*$"));
        c++;
    }

    @AfterClass
    public static void num_tests_passed(){
        System.out.println(c);
        Validator.Validate(c);
    }

}