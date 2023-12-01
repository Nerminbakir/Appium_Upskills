package techproed.day02;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.baseTest.ApiDemosBaseTest;

public class C02_Locators extends ApiDemosBaseTest {

        @Test
        public void testLocators() {

        // 1 - accessibilityId
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println("Accessibility ID = " + element.getText());

        // 2 - id
        element = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("ID = " + element.getText());

        // 3 - className
        element = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("className = " + element.getText());

        // 4 - adroidUIAutomator
        element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
        System.out.println("Adroid UI Automator = " + element.getText());

        // 5 - xpath
        element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Accessibility\"]"));
        System.out.println("xpath = " + element.getText());
    }
}

