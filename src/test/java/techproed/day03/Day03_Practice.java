package techproed.day03;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.baseTest.CalculatorBaseTest;

import java.net.MalformedURLException;

public class Day03_Practice extends CalculatorBaseTest {

    By toplama = AppiumBy.accessibilityId("artı");
    By cikarma = AppiumBy.accessibilityId("çarpı");
    By carpma = AppiumBy.accessibilityId("çarpı");
    By bolme = AppiumBy.accessibilityId("bölü");
    By esittir = AppiumBy.accessibilityId("eşittir");
    By bosAlan = AppiumBy.accessibilityId("Sonuç yok");


    @Test
    public void ikiPozitifSayiyiToplamaTesti() throws MalformedURLException, InterruptedException {




    }
}

