package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserLoginPage {


    private WebDriver driver;
    private By UserName = By.xpath("//input[@id='L-UserNameField']");
    private By Password = By.xpath("//input[@id='L-PasswordField']");
    private By LoginButton = By.xpath("//input[@id='gg-login-enter']");

    public UserLoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public void EnterMail (String email){
        driver.findElement(UserName).sendKeys(email);
    }

    public void EnterPassword (String password){
        driver.findElement(Password).sendKeys(password);
    }

    public HomePage ClickLoginButton(){
        driver.findElement(LoginButton).click();
        return new HomePage(driver);
    }



}
