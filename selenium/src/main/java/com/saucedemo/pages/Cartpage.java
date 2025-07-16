package com.saucedemo.pages;

import org.openqa.selenium.By;

public class Cartpage extends Basepage {

    private By productItemName = By.xpath("//*[@id=\'inventory_item_container\']/div/div/div[2]/div[1]");
    private By backToProducst = By.xpath("//*[@id=\'back-to-products\']")
    
    public boolean isproductItemNamedisplayed() {

        return find(productItemName).isDisplayed();
    }

    public ProductsPage clickBacktoPreviousPage() {

        click(backToProducst);
        return new ProductsPage();
    }


}
