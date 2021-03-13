package tests;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import TestPages.LoginPages;



public class BaseTest {
    private static WebDriver driver;
    public Actions actions;
    protected static LoginPages loginPages;

    @Before
    public void setUp() {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "./src/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);


        loginPages = new LoginPages(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
