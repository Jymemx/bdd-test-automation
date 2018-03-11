package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverFactory;
import pages.automation_practice.HomePage;
import pages.automation_practice.LoginPage;

import static utils.Wait.waitFor;

public class LoginSteps {

    HomePage homePage;
    LoginPage loginPage;

    private String email = "jymemx@gmail.com";
    private String password = "password";

    public LoginSteps(HomePage homePage, LoginPage loginPage) {
        this.homePage = homePage;
        this.loginPage = loginPage;
    }

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        homePage.load().goToLoginPage();
    }

    @When("^the user enters user credentials$")
    public void the_user_enters_user_credentials() {
        loginPage.login(email, password);
    }

    @Then("^the user should not be able to log in$")
    public void the_user_should_not_be_able_to_log_in() {
    }

    @After
    public void closeDriver() {
        waitFor(5);
        DriverFactory.getInstance().removeDriver();
    }
}
