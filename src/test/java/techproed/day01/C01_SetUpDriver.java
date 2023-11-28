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
       String appUrl = System.getProperty("user.dir") + File.separator + "src"
               + File.separator + "test"
               + File.separator + "resources"
               + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl)
//                .setUdid("b61182a7") // UDID; Unique Device Identifier
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

         */