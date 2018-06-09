package com.csci3130.assignment2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class PasswordValidationTest {

    @Test
    public void all_tests() {
        //expected is the number of tests passed /5 by the provided candidate password
        Assert.assertEquals(1, Validator.validate("ruse"));
        Assert.assertEquals(2, Validator.validate("sections"));
        Assert.assertEquals(3, Validator.validate("sections1"));
        Assert.assertEquals(4, Validator.validate("Sections1"));
        Assert.assertEquals(5, Validator.validate("Sections1*"));
    }
}
