package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollDemoTest extends Base_Class {
    @Test
    public void scrollbar() {
        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        /** Scrolling by Google Engine method - Excatly we know where to go **/
      //  androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" +
              //  ".scrollIntoView(text(\"WebView\"));"));

        boolean isElementFound = false;
        int maxScrolls = 5;
        int scrollCount = 0;

        while (!isElementFound && scrollCount < maxScrolls) {
            try {
                WebElement target = androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='WebView']"));
                isElementFound = target.isDisplayed();
                System.out.println("Element found!");
            } catch (Exception e) {
                ((JavascriptExecutor) androidDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                        "left", 100,
                        "top", 200,
                        "width", 800,
                        "height", 1000,
                        "direction", "down",
                        "percent", 0.8
                ));
                scrollCount++;
            }
        }

    }
}
