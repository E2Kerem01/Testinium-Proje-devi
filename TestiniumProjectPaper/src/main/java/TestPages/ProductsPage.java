package TestPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ProductsPage {

    private WebDriver driver;
    public Actions actions;

    private By hoveroverPath = By.xpath("//div[@class='related-searches-wrapper']/div/ul");
    private By NextPagePath = By.xpath("//div[@id='best-match-right']/div[5]/ul/li[@class='next-link']/a[@href='/arama/?k=bilgisayar&sf=2']");
    private By ProductPath = By.xpath("//div//li[@product-index=\"1\"]");
    private By ProductPricePath = By.xpath("/html//div[@id='sp-price-lowPrice']");
    String SecondPageAdress = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";

    public ProductsPage(WebDriver driver) {
        this.driver=driver;
        actions = new Actions(driver);
    }

    public void HoverPage() throws InterruptedException {
        WebElement MouseBtn = driver.findElement(hoveroverPath);
        actions.moveToElement(MouseBtn).perform();
        Thread.sleep(3000);
    }

    public void ClickSecondPage(){
        driver.findElement(NextPagePath).click();
        String urlCheck = driver.getCurrentUrl();
        Assert.assertEquals(urlCheck,SecondPageAdress);

    }

    public void CheckSecondPage(){
        String urlCheck = driver.getCurrentUrl();
        Assert.assertEquals(urlCheck,"https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");

    }


    public SelectedProductPage SelectProduct(){
        driver.findElement(ProductPath).click();
        return new SelectedProductPage(driver);

    }



}
