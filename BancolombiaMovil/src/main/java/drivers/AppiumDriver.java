package drivers;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriver {
    public static AndroidDriver driver;

    public static AppiumDriver suNavegador(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","77a9d637");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage","com.todo1.bc.proyecto7");
            capabilities.setCapability("appActivity","com.todo1.bc.proyecto7.MainActivity");
            capabilities.setCapability("noReset","true");
            capabilities.setCapability("platformVersion","6.0.1");
            //capabilities.setCapability("unicodekeyboard", true);
            //capabilities.setCapability("resetkeyboard", true);
            //capabilities.setCapability ("automationName", "UiAutomator2");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            //http://127.0.0.1:4723/wd/hub
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AppiumDriver();
    }

    public io.appium.java_client.AppiumDriver<MobileElement> on(){
        return driver;
    }
}