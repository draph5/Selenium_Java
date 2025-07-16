package com.saucedemo.pages;

import org.openqa.selenium.By;


public class ProductsPage extends Basepage{

    private By productsHeader = By.xpath("//*[@id=\'header_container\']/div[2]/span");
    private By productList1 = By.xpath("//*[@id=\'item_4_title_link\']/div");

    public boolean isProductHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }

    public boolean isProduct1Displayed() {
        return find(productList1).isDisplayed();
    }

    public Cartpage clickProduct1() {
        click(productList1);
        return new Cartpage();
    }
}
