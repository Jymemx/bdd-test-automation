package driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private String chromeDriverVersion = "2.34";

    private static DriverFactory instance = new DriverFactory();

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {

        @Override
        protected WebDriver initialValue() {
            ChromeDriverManager.getInstance().version(chromeDriverVersion).setup();
            return new ChromeDriver();
        }
    };

    private DriverFactory() {

    }

    public static DriverFactory getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void removeDriver() {
        driver.get().quit();
        driver.remove();
    }

}
