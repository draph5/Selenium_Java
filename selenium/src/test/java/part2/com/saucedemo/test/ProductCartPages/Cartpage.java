package part2.com.saucedemo.test.ProductCartPages;

import org.openqa.selenium.By;

import com.saucedemo.pages.Basepage;

public class Cartpage extends Basepage{

    private By CartInventoryName = By.xpath("//*[@id=\'inventory_item_container\']/div/div/div[2]/div[1]");

    public boolean isProductNameDisplayed() {

        return find(CartInventoryName).isDisplayed();
    }

}
