package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    protected AppiumDriver driver;

        @BeforeEach
        public void setUp() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("platformVersion", "11.0");
            caps.setCapability("deviceName", "samsung");
            caps.setCapability("udid", "RF8R10PNZKY");
            caps.setCapability("app", "/opt/sahibinden/imdb.apk");
            caps.setCapability("appActivity", "com.imdb.mobile.HomeActivity");
            caps.setCapability("newCommandTimeout", "600");
            caps.setCapability("autoGrantPermissions", true);
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        }

        @AfterEach
        public void tearDown() {
            if (null != this.driver) {
                this.driver.quit();
            }

        }

    }