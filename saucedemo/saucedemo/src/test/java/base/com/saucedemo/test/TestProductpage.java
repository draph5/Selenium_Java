package base.com.saucedemo.test;

import org.testng.annotations.Test;

import com.saucedemo.pages.ProductDetailpage;
import com.saucedemo.pages.Productpage;

import base.com.saucedemo.Base.Basetest;


public class TestProductpage extends Basetest{

    @Test
    public void testProductpage() throws InterruptedException {
    Productpage productpage = loginpage.userLogin("standard_user", "secret_sauce");
    String actualResult = productpage.getProductPageName();
    String expectedResult = "Products";
    productpage.isProductHeaderDisplayed(actualResult, expectedResult);
    }

    @Test
    public void testProductslist() throws InterruptedException {
        Productpage productpage = loginpage.userLogin("standard_user", "secret_sauce");
        Thread.sleep(1000);
        ProductDetailpage productDetailpage = productpage.clickProduct1();
        Thread.sleep(1000);

    }
}
