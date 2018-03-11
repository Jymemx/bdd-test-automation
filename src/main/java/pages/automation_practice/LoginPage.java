package pages.automation_practice;

import pages.BasePage;

public class LoginPage extends BasePage<LoginPageObjectRepository>{

    public LoginPage(LoginPageObjectRepository repository) {
        super(repository);
    }

    public void login(String emailAddress, String password) {
        enterEmailAddress(emailAddress);
        enterPassword(password);
        clickSignIn();
    }

    public boolean isAuthenticationFailed() {
        return isElementPresent(repository.authenticationFailedLabel);
    }

    private LoginPage enterEmailAddress(String emailaddress) {
        webDriver.findElement(repository.emailAddressTextField).sendKeys(emailaddress);
        return this;
    }

    private LoginPage enterPassword(String password) {
        webDriver.findElement(repository.passwordTextField).sendKeys(password);
        return this;
    }

    private void clickSignIn() {
        webDriver.findElement(repository.signInButton).click();
    }
}
