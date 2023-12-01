package techproed.day02;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Day02_Practice {

    @Test
    public void testLocators() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);

        // 1 - Accessibility (accessibilityId) ile
        driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();

        driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.accessibilityId("Custom View")).click();
        driver.navigate().back();
        driver.navigate().back();

        // 2 - Content (id ile)
        driver.findElements(AppiumBy.id("android:id/text1")).get(4).click();

        driver.findElements(AppiumBy.id("android:id/text1")).get(0).click();
        driver.navigate().back();

        driver.findElements(AppiumBy.id("android:id/text1")).get(1).click();
        driver.navigate().back();

        driver.findElements(AppiumBy.id("android:id/text1")).get(2).click();
        driver.navigate().back();

        driver.findElements(AppiumBy.id("android:id/text1")).get(3).click();
        driver.navigate().back();

        driver.findElements(AppiumBy.id("android:id/text1")).get(4).click();
        driver.navigate().back();

        driver.findElements(AppiumBy.id("android:id/text1")).get(5).click();
        driver.navigate().back();
        driver.navigate().back();

        // Media (Classname ile)
        driver.findElements(AppiumBy.className("android.widget.TextView")).get(7).click();

        driver.findElements(AppiumBy.className("android.widget.TextView")).get(1);

        driver.findElements(AppiumBy.className("android.widget.TextView")).get(2).click();
        driver.navigate().back();

        driver.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
        driver.navigate().back();
        driver.navigate().back();

        // NFC androidUIAutomator ile
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"NFC\")")).click();

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundDispatch\")")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundNdefPush\")")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"TechFilter\")")).click();
        driver.navigate().back();
        driver.navigate().back();

        // OS Xpath ile
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"OS\"]")).click();
        //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"OS\"]"));

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Morse Code\"]")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Rotation Vector\"]")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Sensors\"]")).click();
        driver.navigate().back();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"SMS Messaging\"]")).click();
        driver.navigate().back();
        driver.navigate().back();
    }
}


