package com.saucedemo.pages;

import org.openqa.selenium.By;

public class Productpage extends Basepage {

    private final By productNameField = By.xpath("//*[@id=\'header_container\']/div[2]/span");
    private final By backpackProduct = By.xpath("//*[@id=\'item_4_title_link\']/div");

    public boolean isProductHeaderDisplayed(String actualMsg, String expectedMsg) {
        return actualMsg.contains(expectedMsg);
    }

    public String getProductPageName() {
        return find(productNameField).getText();
    }

    public ProductDetailpage clickProduct1() {
        click(backpackProduct);
        return new ProductDetailpage();
    }

    public boolean isProductDisplayed (String actualMsg, String expectedMsg) {
        return actualMsg.contains(expectedMsg);
    }
}
