package tests;



import TestPages.*;
import org.junit.Test;
import java.io.IOException;


public class LoginTest extends BaseTest {



    @Test
    public void correctOpen() throws IOException, InterruptedException {

            UserLoginPage userLoginPage = loginPages.clickLoginPage(); // Gittigidiyor sayfası açılır Giriş yapma butonuna tıklanır.
            userLoginPage.EnterMail("denemetesttest5@gmail.com"); // Kullanıcı adı alanına mail girilir.
            userLoginPage.EnterPassword("denemedeneme555"); // Password alanına şifre girilir.


            HomePage homePage = userLoginPage.ClickLoginButton(); // Giriş yap butonuna tıklanır.
            homePage.CheckMyUserName(); // Giriş yapıldıktan sonra login işlemi kontrol edilir.
            homePage.EnterWord("bilgisayar"); // Arama kısmına bilgisayar yazılır.

            ProductsPage productsPage = homePage.ClickSearchButton(); // Arama butonuna tıklanır.
            productsPage.HoverPage(); // Mouse sayfa değiştirme ksımına getirilir.
            productsPage.ClickSecondPage(); // 2.sayfaya geçilir.
            productsPage.CheckSecondPage(); // 2.sayfanın açıldığı kontrol edilir.

            SelectedProductPage selectedProductPage = productsPage.SelectProduct(); // Ürün seçilir.
            selectedProductPage.SaveProductPrice(); // Ürün sayfasındaki fiyatı kaydedilir.
            selectedProductPage.HoverBasketButton(); // Sepete ekleme butonu üzerine gidilir.
            selectedProductPage.AddBasket(); // Sepete ekle butonuna tıklanır.

            BasketPage basketPage = selectedProductPage.ClickBasketButton(); // Sepete tıklanarak sepet açılır.
            basketPage.CheckProductsPrice(); // Ürünün sepetteki fiyatı ile ürün sayfasındaki fiyatı karşılaştırılır.
            basketPage.IncreaseProductNumber(); // Ürün adeti arttırılır.
            basketPage.CheckProductNumber(); // Arttırılma kontrol edilir.
            basketPage.DeletePart(); // Sepetteki ürünler silinir.
            basketPage.CheckAfterDelete(); // Sepetin boş olduğu kontrol edilir.




    }



}
