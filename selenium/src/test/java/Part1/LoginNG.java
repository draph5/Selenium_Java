package Part1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;


public class LoginNG {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000); // Wait for any pending operations to complete
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Wait for the page to load completely
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
        Thread.sleep(2000); // Wait for the login to complete
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";
        Assert.assertNotEquals(actualResult, expectedResult, "Login failed or dashboard not displayed as expected.");

    }






}