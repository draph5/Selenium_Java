package part2.com.saucedemo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.saucedemo.pages.Basepage;
import com.saucedemo.pages.Loginpage;


public class BaseTest {

    protected WebDriver driver;
    protected Basepage basepage;
    protected Loginpage loginpage;
    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basepage = new Basepage();
        basepage.setDriver(driver);
        loginpage = new Loginpage();

    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
