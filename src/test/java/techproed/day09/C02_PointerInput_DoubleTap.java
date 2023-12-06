package techproed.day09;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import techproed.baseTest.CalculatorBaseTest;

import java.time.Duration;
import java.util.Collections;
public class C02_PointerInput_DoubleTap extends CalculatorBaseTest {
    @Test
    public void testDoubleTap() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();

        // 875, 400

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence sequence = new Sequence(finger, 1)
                // İlk tıklama adımı
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 900, 380))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(300)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

        // İkinci tıklama adımı
                .addAction(finger.createPointerMove(Duration.ofMillis(10), PointerInput.Origin.viewport(), 905, 385))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(300)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));

        Thread.sleep(3000);
    }
}
