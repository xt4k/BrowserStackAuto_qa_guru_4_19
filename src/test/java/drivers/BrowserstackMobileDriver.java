package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.WebConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.System.setProperty;

public class BrowserstackMobileDriver implements WebDriverProvider {

    public static URL getBrowserstackUrl(DesiredCapabilities dc) {
        try {
            return new URL(dc.getCapability("browserstack.server").toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        capabilities.setCapability("browserstack.user", config.getUser());
        capabilities.setCapability("browserstack.key", config.getKey());
        capabilities.setCapability("browserstack.server", config.getServer());
        capabilities.setCapability("app", config.getBsApp());
        capabilities.setCapability("device", config.getDevice());
        capabilities.setCapability("os_version", config.getOsVer());
        capabilities.setCapability("project", config.getProject());
        capabilities.setCapability("build", config.getBuild());
        capabilities.setCapability("name", config.getTestName());

        setProperty("bs.user",config.getUser());
        setProperty("bs.key",config.getKey());

        return new AndroidDriver(getBrowserstackUrl(capabilities), capabilities);
    }
}
