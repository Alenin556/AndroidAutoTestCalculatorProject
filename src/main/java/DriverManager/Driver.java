package DriverManager;

import com.codeborne.selenide.Configuration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.APP;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Driver {

    public static AppiumDriver driver;


    public static void driverSetUp() throws Exception {
        Configuration.browser = "deviceHost";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(DEVICE_NAME, "Pixel 2 API 35 Emulator");
        capabilities.setCapability(PLATFORM_NAME, "android");
        capabilities.setCapability(APP, "C:\\GitHubProjects\\MoodleAndroidLesson17\\src\\test\\resources\\app\\Calculator.apk");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4706/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
