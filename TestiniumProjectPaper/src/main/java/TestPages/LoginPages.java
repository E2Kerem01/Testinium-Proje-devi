package TestPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class LoginPages {

    private WebDriver driver;
    public Actions actions;


    private By LoginBoxPath = By.xpath("//div[@title='Giriş Yap']");
    private By LoginButtonPath = By.xpath("//a[@href='https://www.gittigidiyor.com/uye-girisi']/span");
    protected static String url = "https://www.gittigidiyor.com/";


    public LoginPages(WebDriver driver) {
        this.driver=driver;
        actions = new Actions(driver);

    }


    public UserLoginPage clickLoginPage() throws InterruptedException {
        driver.get(url);

        WebElement loginBtn = driver.findElement(LoginBoxPath);
        actions.moveToElement(loginBtn).perform();
        Thread.sleep(3000);

        driver.findElement(LoginButtonPath).click();
        return new UserLoginPage(driver);
    }








}
