package TestPages;

import static TestPages.SelectedProductPage.ProductValue;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasketPage {
    private WebDriver driver;
    public Actions actions;


    private By PiegeProductPath = By.xpath("//div//select[@class='amount']");
    private By ProductBasketPrice = By.xpath("//div[@id='cart-price-container']//p[@class='new-price']");
    private By IncreaseProduct = By.xpath("/html//div[@id='cart-items-container']/div[@class='products-container']/div/div//select[@class='amount']/option[@value='2']");
    String limit = "Ürün Toplamı (2 Adet)";
    private By BasketName = By.xpath("/html//div[@id='cart-items-container']/div/table//h1[.='Alışveriş Sepetim']");
    private By ProductLimit = By.xpath("//li//div[@class=\"gg-d-16 detail-text\"]");
    private By DeleteButton = By.xpath("//div[@class='row']/a[@title='Sil']/i[@class='gg-icon gg-icon-bin-medium']");
    private By CheckDeletedBasket = By.xpath("/html//div[@id='empty-cart-container']/div[@class='gg-d-24']/div[1]/div/div[2]/h2");
    String BasketDeleteWord = "Sepetinizde ürün bulunmamaktadır.";


    public BasketPage(WebDriver driver) {
        this.driver=driver;

    }

    public void CheckProductsPrice (){
        String Basketprice = driver.findElement(ProductBasketPrice).getText();
        Assert.assertEquals(ProductValue,Basketprice);

    }

    public void IncreaseProductNumber() throws InterruptedException {
        driver.findElement(IncreaseProduct).click();
        Thread.sleep(3000);
        driver.findElement(BasketName).click();


    }

    public void CheckProductNumber() throws InterruptedException {
        String  ProductNumber  = driver.findElement(ProductLimit).getText();
        Assert.assertTrue(limit.contains(ProductNumber));
        Thread.sleep(3000);
    }

    public void DeletePart() throws InterruptedException {
        driver.findElement(DeleteButton).click();
        Thread.sleep(3000);


    }

    public void CheckAfterDelete() throws InterruptedException {
        String BasketDelete = driver.findElement(CheckDeletedBasket).getText();
        Assert.assertTrue(BasketDeleteWord.contains(BasketDelete));



    }

}
