package techproed.day08_practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.baseTest.TelefonBaseTest;

public class P01_Telefon_LongClickGesture extends TelefonBaseTest{

    /*
        Uygulama: Telefon
            Telefon uygulamasına gir
            +90 530 486 1275 numarasını ara
            Mesajda, Arama başarısız oldu. metnini doğrula
            Tamam butonuna bas
     */

    @Test
    public void testTelefon(){
        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();

        By bir = AppiumBy.accessibilityId("bir Telesekreter ");
        By iki = AppiumBy.accessibilityId("iki A B C");
        By uc = AppiumBy.accessibilityId("üç D E F");
        By dort = AppiumBy.accessibilityId("dört G H I");
        By bes = AppiumBy.accessibilityId("beş J K L");
        By alti = AppiumBy.accessibilityId("altı M N O");
        By yedi = AppiumBy.accessibilityId("yedi P Q R S");
        By sekiz = AppiumBy.accessibilityId("sekiz T U V");
        By dokuz = AppiumBy.accessibilityId("dokuz W X Y Z");
        By sifir = AppiumBy.accessibilityId("sıfır +");
        By ara = AppiumBy.accessibilityId("Çağrı");

        longClickGesture(driver, driver.findElement(sifir), 1000);
        clickGesture(driver, driver.findElement(dokuz));
        clickGesture(driver, driver.findElement(sifir));
        clickGesture(driver, driver.findElement(bes));
        clickGesture(driver, driver.findElement(uc));
        clickGesture(driver, driver.findElement(sifir));
        clickGesture(driver, driver.findElement(dort));
        clickGesture(driver, driver.findElement(sekiz));
        clickGesture(driver, driver.findElement(alti));
        clickGesture(driver, driver.findElement(bir));
        clickGesture(driver, driver.findElement(iki));
        clickGesture(driver, driver.findElement(yedi));
        clickGesture(driver, driver.findElement(bes));
        clickGesture(driver, driver.findElement(ara));

        WebElement message = driver.findElement(AppiumBy.id("com.android.server.telecom:id/alertTitle"));
        Assert.assertTrue(message.isDisplayed());

        WebElement tamamButonu = driver.findElement(AppiumBy.id("android:id/button1"));
        tamamButonu.click();
    }
}
