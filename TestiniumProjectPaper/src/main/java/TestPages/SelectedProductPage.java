package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectedProductPage {
    private WebDriver driver;
    public Actions actions;

    public static String ProductValue;

    private By ProductPagePricePath = By.xpath("/html//div[@id='sp-price-lowPrice']");
    private By hoverBasketButton = By.xpath("/html//div[@id='product-collection-button']");
    private By AddBasketButtonPath = By.xpath("//button[@id='add-to-basket']");
    private By BasketPageButton = By.xpath("//a[@href='https://www.gittigidiyor.com/sepetim']");

    public SelectedProductPage(WebDriver driver) {
        this.driver=driver;
        actions = new Actions(driver);
    }

    public void SaveProductPrice () {
        ProductValue = driver.findElement(ProductPagePricePath).getText();
        System.out.println(ProductValue);
    }

    public void HoverBasketButton() throws InterruptedException {
        WebElement BasketBtn1 = driver.findElement(hoverBasketButton);
        actions.moveToElement(BasketBtn1).perform();
        Thread.sleep(3000);
    }

    public void AddBasket() throws InterruptedException {
        driver.findElement(AddBasketButtonPath).click();
        Thread.sleep(3000);
    }

    public BasketPage ClickBasketButton(){
        driver.findElement(BasketPageButton).click();
        String asd = ProductValue;
        return new BasketPage(driver);

    }


}
