package TestPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;



public class HomePage {
    private WebDriver driver;
    public Actions actions;


    String MyUserName = "denemetest737269";
    private By SearchBoxPath = By.xpath("//header[@id='main-header']/div/div/div/div//form[@action='https://www.gittigidiyor.com/arama']//input");
    private By SearchButtonPath = By.xpath("//button[@type='submit']/span[.='BUL']");
    private By MyUserNamePath = By.xpath("//div[@title='Hesabım']/div[@class='gekhq4-4 hwMdSM']/span[.='denemetest737269']");

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    public void CheckMyUserName(){
        String MyUserNameInSıte = driver.findElement(MyUserNamePath).getText();
        Assert.assertEquals(MyUserName,MyUserNameInSıte);

    }

    public void EnterWord(String word){
        driver.findElement(SearchBoxPath).sendKeys(word);
    }


    public ProductsPage ClickSearchButton(){
        driver.findElement(SearchButtonPath).click();
        return new ProductsPage(driver);
    }




}
