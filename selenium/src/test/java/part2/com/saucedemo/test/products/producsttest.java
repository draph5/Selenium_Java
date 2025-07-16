package part2.com.saucedemo.test.products;

import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.saucedemo.pages.Cartpage;
import com.saucedemo.pages.ProductsPage;

import part2.com.saucedemo.base.BaseTest;

public class producsttest extends BaseTest{

    @Test
    public void testproductapplication() {
        ProductsPage productsPage = loginpage.LogIntoApp("standard_user", "secret_sauce");
        //Test productpage header
        assertTrue(productsPage.isProductHeaderDisplayed(),"\n Header is not displayed. \n");

    }

    @Test
    public void testproduct_1() {
        ProductsPage productsPage = loginpage.LogIntoApp("standard_user", "secret_sauce");  
        //test first product on list
        assertTrue(productsPage.isProduct1Displayed(),"Product Backpack is not displayed. ");
    }

    @Test
    public void clickProduct1() throws InterruptedException {
        
        ProductsPage productsPage = loginpage.LogIntoApp("standard_user", "secret_sauce");
        Cartpage cartpage = productsPage.clickProduct1();
        Assert.assertTrue(cartpage.isproductItemNamedisplayed(),"Product name is not displayed. ");
        Thread.sleep(2000);
    }

}
