package pages.automation_practice;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePage extends BasePage<HomePageObjectRepository> {

    public HomePage(WebDriver webDriver, HomePageObjectRepository repository) {
        super(webDriver, repository);
    }

    public HomePage load() {
        webDriver.get(repository.url);
        return this;
    }
}
