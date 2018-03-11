package pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BasePage<T extends PageObjectRepository> {

    protected WebDriver webDriver;
    protected T repository;

    public BasePage(T repository) {
        this.webDriver = DriverFactory.getInstance().getDriver();
        this.repository = repository;
    }

}
