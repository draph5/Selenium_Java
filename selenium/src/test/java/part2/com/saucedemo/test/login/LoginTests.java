package part2.com.saucedemo.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;


import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage() {

        loginpage.LogIntoApp("QWeqeqw", "QWeqwe");
        String actualMessage = loginpage.getErrorMessage();
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertTrue(actualMessage.contains(expectedMessage));

    }
    
}
