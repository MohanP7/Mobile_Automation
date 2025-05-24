package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LongPress extends Base_Class{

    @Test
    public void long_press() throws InterruptedException {
    androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
    androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
    androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();

    WebElement element = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));

        longPressAction(element);
        /*   ((JavascriptExecutor) androidDriver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "duration", 2000 ));
        */
        /**Verify Sample Menu displayed correctly **/
        Assert.assertTrue(androidDriver.findElement(By.id("android:id/title")).isDisplayed());


    }
}
