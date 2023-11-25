package techproed.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetUpDriver {

    @Test
    public void testDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "b61182a7"); //cmd ekranına adb devices yazıp enter dedikten sonra b611..
        capabilities.setCapability("app", "C:\\Users\\nrmn_\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
//        capabilities.setCapability("appPackage", "io.appium.android.apis");
//        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos")
        ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, capabilities);

    }

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("b61182a7") // UDID; Unique Device Identifier
                .setApp("C:\\Users\\nrmn_\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
//                .setAppPackage("io.appium.android.apis")
//                .setAppActivity("io.appium.android.apis.ApiDemos")
                ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);
    }
}
