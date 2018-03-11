package pages.automation_practice;

import pages.BasePage;

public class HomePage extends BasePage<HomePageObjectRepository> {

    LoginPage loginPage;

    public HomePage(HomePageObjectRepository repository, LoginPage loginPage) {
        super(repository);
        this.loginPage = loginPage;
    }

    public HomePage load() {
        webDriver.get(repository.url);
        return this;
    }

    public LoginPage goToLoginPage() {
        webDriver.findElement(repository.signInButton).click();
        return loginPage;
    }
}
