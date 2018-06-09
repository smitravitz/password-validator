package com.csci3130.assignment2;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class PasswordJUnitTest {

    //count variable
    static int c = 0;

    @Test
    public void not_password() {
        Assert.assertEquals(1, Validator.validate("ruse"));
        c++;
    }
    @Test
    public void min_length() {
        Assert.assertEquals(2, Validator.validate("sections"));
        c++;
    }
    @Test
    public void one_digit(){
        Assert.assertEquals(3, Validator.validate("sections1"));
        c++;
    }
    @Test
    public void one_upper_and_lower(){
        Assert.assertEquals(4, Validator.validate("Sections1"));
        c++;
    }
    @Test
    public void one_spec_char() {
        Assert.assertEquals(5, Validator.validate("Sections1*"));
        c++;
    }
    @AfterClass
    public static void one_more_pass() {
        System.out.println(c + "/5 passed");
    }
}
