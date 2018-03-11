package pages;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasePage<T extends PageObjectRepository> {

    protected T repository;
    protected WebDriver webDriver;

    final long implicitWaitDuration = 10;

    public BasePage(T repository) {
        this.repository = repository;
        this.webDriver = DriverFactory.getInstance().getDriver();
        webDriver.manage().timeouts().implicitlyWait(implicitWaitDuration, TimeUnit.SECONDS);
    }

    public boolean isElementPresent(By locator) {
        return webDriver.findElements(locator).size() == 1;
    }
}
