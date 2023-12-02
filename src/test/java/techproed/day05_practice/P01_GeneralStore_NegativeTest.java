package techproed.day05_practice;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.baseTest.GeneralStoreBaseTest;

public class P01_GeneralStore_NegativeTest extends GeneralStoreBaseTest {

    /*
        Uygulama: GeneralStore
            GeneralStore uygulamasına gir
            Your Name kutusunu boş bırak
            Let’s Shop butonuna tıkla
            Hata mesajını doğrula (Toast Message)
     */
    @Test
    public void testGeneralStoreNegativeTest(){
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        String toastMessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");

        Assert.assertEquals(toastMessage, "Please enter your name");
    }
}
