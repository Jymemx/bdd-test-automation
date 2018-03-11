package pages.automation_practice;

import org.openqa.selenium.WebDriver;
import org.picocontainer.annotations.Inject;
import pages.BasePage;

public class HomePage extends BasePage<HomePageObjectRepository> {

    public HomePage(HomePageObjectRepository repository) {
        super(repository);
    }

    public HomePage load() {
        webDriver.get(repository.url);
        return this;
    }

}
