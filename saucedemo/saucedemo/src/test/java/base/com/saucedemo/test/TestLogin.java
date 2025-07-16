package base.com.saucedemo.test;

import org.testng.annotations.Test;

import base.com.saucedemo.Base.Basetest;


public class TestLogin extends Basetest{

    @Test
    public void testLoginErrorMsg() {
        loginpage.userLogin("standard_user", "asd2312");
        String actualMsg = loginpage.getErrorMsg();
        String expectedMsg = "Epic sadface: Username and password do not match any user in this service";
        loginpage.isErrorMsgDisplayed(actualMsg, expectedMsg);

    }


}
