package base.com.saucedemo.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.saucedemo.pages.Basepage;
import com.saucedemo.pages.Loginpage;
import com.saucedemo.pages.ProductDetailpage;
import com.saucedemo.pages.Productpage;

public class Basetest {

    protected WebDriver driver;
    protected Basepage basepage;
    protected Loginpage loginpage;
    protected Productpage productpage;
    protected ProductDetailpage productdetailpage;
    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        basepage = new Basepage();
        basepage.setDriver(driver);
        loginpage = new Loginpage();
        productpage = new Productpage();
        productdetailpage = new ProductDetailpage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    
}
