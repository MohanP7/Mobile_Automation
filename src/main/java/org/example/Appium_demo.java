package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;



public class Appium_demo extends Base_Class{

    @Test()
    public void Appium_Test() throws MalformedURLException, URISyntaxException, RuntimeException {

        androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
        androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        androidDriver.findElement(By.id("android:id/checkbox")).click();
        androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/alertTitle']")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");
        androidDriver.findElement(By.id("android:id/edit")).sendKeys("Pratyush");
        androidDriver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    }
}
