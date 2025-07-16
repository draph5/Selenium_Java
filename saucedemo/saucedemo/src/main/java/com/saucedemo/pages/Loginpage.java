package com.saucedemo.pages;

import org.openqa.selenium.By;

public class Loginpage extends Basepage {

    private By usernameField = By.xpath("//*[@id=\'user-name\']");
    private By passwordField = By.xpath("//*[@id=\'password\']");
    private By errorMsgField = By.xpath("//*[@id=\'login_button_container\']/div/form/div[3]/h3");
    private By loginButtonField = By.xpath("//*[@id=\'login-button\']");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public Productpage userLogin(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public Productpage clickLoginButton() {
        click(loginButtonField);
        return new Productpage();
    }

    public String getErrorMsg() {
        return find(errorMsgField).getText();
    }

    public boolean isErrorMsgDisplayed(String actualMsg, String expectedMsg) {
        return actualMsg.contains(expectedMsg);
    }

}
