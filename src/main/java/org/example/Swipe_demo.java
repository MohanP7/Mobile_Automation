package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Swipe_demo extends Base_Class {
    @Test
    public void swipeDemo() {
        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

        WebElement element=androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]"));

        Assert.assertEquals(androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]")).
                getAttribute("focusable"),"true");

        swipeAction(element,"left");
        /** Swipe logic **/
/*
        ((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction","left",
                "percent",0.75));
*/
        Assert.assertEquals(androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]")).
                getAttribute("focusable"),"false");

    }
}
