package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Base_Class {
    public AppiumDriverLocalService service;
    public AndroidDriver androidDriver;
    @BeforeClass
    public  void Configuration() throws MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
            .withIPAddress("127.0.0.1").usingPort(4724).withTimeout(Duration.ofSeconds(60)).build();
        service.start();

    UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pratyush_Pixel");
        options.setApp("C:\\Users\\HP\\AndroidStudioProjects\\android-apidemos\\app\\build\\outputs\\apk\\debug\\app-debug.apk");

    androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4724"), options);

    androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterClass
    public void CloseMethod(){
        androidDriver.quit();
        service.stop();
    }
}