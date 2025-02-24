package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.net.URL;
import java.time.Duration;

public class appium_server {
    public AppiumDriverLocalService service;
    public AndroidDriver androidDriver;
    public  void Configuration throws void MalformedURLException{
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
            .withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(60)).build();
        service.start();

    UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pratyush_Pixel");
        options.setApp("C:\\Users\\HP\\AndroidStudioProjects\\android-apidemos\\app\\build\\outputs\\apk\\debug\\app-debug.apk");

    androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
}
    public void CloseMethod{
        androidDriver.quit();
        service.stop();
    }
}