package techproed.day05_practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.baseTest.MyDemoBaseTest;

public class Day05_Practice extends MyDemoBaseTest {

    /*
         Uygulama: MyDemoApp
                MyDemoApp uygulamasına gir
                Menüyü aç
                Login ol (bob@example.com, 10203040)
                Login butonuna tıkla
                İlk ürünü seç
                Ürün miktarını ikiye çıkar
                Add To Cart butonuna tıkla
                Sepete git
                Ürün miktarının toplam miktar ile aynı olduğunu doğrula
                Proceed To Checkout butonuna tıkla
     */

    @Test
    public void test() throws InterruptedException {

        WebElement menu = driver.findElement(AppiumBy.accessibilityId("open menu"));
        menu.click();

        WebElement menuItemLogin = driver.findElement(AppiumBy.accessibilityId("menu item log in"));
        menuItemLogin.click();

        WebElement usernameInputField = driver.findElement(AppiumBy.accessibilityId("Username input field"));
        usernameInputField.sendKeys("bob@example.com");

        WebElement passwordInputField = driver.findElement(AppiumBy.accessibilityId("Password input field"));
        passwordInputField.sendKeys("10203040");

        WebElement loginButton = driver.findElement(AppiumBy.accessibilityId("Login button"));
        loginButton.click();

        WebElement productTitle = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
        productTitle.click();
    }
}