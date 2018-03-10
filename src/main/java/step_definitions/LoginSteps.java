package step_definitions;

import com.google.inject.Inject;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.automation_practice.HomePage;
import pages.automation_practice.HomePageObjectRepository;

public class LoginSteps {

    WebDriver webDriver;
    HomePageObjectRepository repository;
    HomePage homePage;

    public LoginSteps() {
        String chromeDriverVersion = "2.34";
        ChromeDriverManager.getInstance().version(chromeDriverVersion).setup();
        this.webDriver = new ChromeDriver();
        this.repository = new HomePageObjectRepository();
        this.homePage = new HomePage(webDriver, repository);
    }



    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        homePage.load();
    }

    @When("^the user enters user credentials$")
    public void the_user_enters_user_credentials() {
    }

    @Then("^the user should not be able to log in$")
    public void the_user_should_not_be_able_to_log_in() {
    }
}
