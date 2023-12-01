package techproed.day03;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.baseTest.ApiDemosBaseTest;

public class C03_ElementDegerleriniCekme extends ApiDemosBaseTest {

    @Test
    public void testElementDegerleriniCekme() {
        By accessibility = AppiumBy.accessibilityId("Accessibility");

        System.out.println("Get Text = " + driver.findElement(accessibility).getText());
        System.out.println("Get Attribute = " + driver.findElement(accessibility).getAttribute("package"));
        System.out.println("Checkable = " + driver.findElement(accessibility).getAttribute("checkable"));

        System.out.println("isSelected = " + driver.findElement(accessibility).isSelected());
        System.out.println("isEnabled = " + driver.findElement(accessibility).isEnabled());
        System.out.println("isDisplayed = " + driver.findElement(accessibility).isDisplayed());

        System.out.println("Get Size : " + driver.findElement(accessibility).getSize());
        System.out.println("Get Location : " + driver.findElement(accessibility).getLocation());
    }
}