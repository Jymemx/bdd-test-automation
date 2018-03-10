package pages;

import org.openqa.selenium.WebDriver;

public class BasePage<T extends PageObjectRepository> {

    protected WebDriver webDriver;
    protected T repository;

    public BasePage(WebDriver webDriver, T repository) {
        this.webDriver = webDriver;
        this.repository = repository;
    }
}
