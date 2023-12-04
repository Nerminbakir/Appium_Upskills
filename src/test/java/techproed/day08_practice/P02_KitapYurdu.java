package techproed.day08_practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.baseTest.KitapYurduBaseTest;

public class P02_KitapYurdu extends KitapYurduBaseTest {

            /*
            Uygulama: Kitap Yurdu
                Kitap Yurdu uygulamasına gir
                İlgi Görenler bölümündeki 5. kitaba tıkla
                Kitap adı, Yazar adı ve Yayınevi adı bilgilerini yazdır
                Künye başlıklarını ve bilgilerini yazdır
            */

    @Test
    public void testKitapYurdu() throws InterruptedException {
        WebElement swipeElement = driver.findElement(AppiumBy.id("com.mobisoft.kitapyurdu:id/recyclerViewList"));
        swipeGesture(driver, swipeElement, "left", 1.0, 1000);

        WebElement besinciKitap = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.mobisoft.kitapyurdu:id/imageViewProduct\"])[2]"));
        clickGesture(driver, besinciKitap);


        Thread.sleep(5000);

    }
}
