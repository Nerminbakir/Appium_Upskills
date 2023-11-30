package techproed.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetUpDriver {

    @Test
    public void testDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android"); // zorunlu
        capabilities.setCapability("automationName", "uiautomator2"); // zorunlu
        capabilities.setCapability("app", "C:\\Users\\nrmn_\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
//        capabilities.setCapability("udid", "b61182a7"); //cmd ekranına adb devices yazıp enter dedikten sonra b611.. // duruma göre değişir, zorunlu değil.
//        capabilities.setCapability("appPackage", "io.appium.android.apis");
//        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos")
        ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);

    }

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
       String appUrl = System.getProperty("user.dir") // C:\Users\nrmn_\IdeaProjects\Appium_Upskills
               + File.separator + "src" // src
               + File.separator + "test" // test
               + File.separator + "resources" // resources
               + File.separator + "ApiDemos-debug.apk"; // ApiDemos-debug.apk

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl)
//                .setUdid("b61182a7") // UDID; Unique Device Identifier --> Birden fazla cihaz varsa yazmak gerekir. Tek cihaz için yazmasakta doğru bir şekilde çalışır.
//                .setAppPackage("io.appium.android.apis")
//                .setAppActivity("io.appium.android.apis.ApiDemos")
                ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);
    }
}
        /*
            Yukarıdaki her iki test notasyonu da aynı işlevi görür.
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "android");          -- UiAutomator2Options options = new UiAutomator2Options(); bu ifadenin içindedir.
            capabilities.setCapability("automationName", "uiautomator2");   -- UiAutomator2Options options = new UiAutomator2Options(); bu ifadenin içindedir.

            File.separator; Java programlama dilinde dosya yollarını oluştururken kullanılan bir sabittir.
            Bu sabit, platforma özgü dosya ayırıcı karakterini temsil eder.
            Dosya ayırıcı karakteri, işletim sistemine bağlı olarak farklılık gösterir.
            Örneğin, Windows işletim sistemlerinde dosya ayırıcı karakteri "\", Unix tabanlı işletim sistemlerinde ise "/" olarak kullanılır.

        */

