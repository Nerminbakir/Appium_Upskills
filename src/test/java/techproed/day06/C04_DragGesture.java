package techproed.day06;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.baseTest.ApiDemosBaseTest;

public class C04_DragGesture extends ApiDemosBaseTest {
    @Test
    public void testDragGestureElement() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", 715,
                "endY", 671,
                "speed", 500
        ));

        // dragGesture(driver, element, 715, 671);
        Thread.sleep(5000);
    }

    @Test
    public void testDragGestureCoordinate() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "startX", 240,
                "startY", 660,
                "endX", 715,
                "endY", 671,
                "speed", 500
        ));

        // dragGesture(driver, 240, 660, 715, 671);

        Thread.sleep(5000);
    }
}
