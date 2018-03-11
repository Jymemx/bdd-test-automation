package pages.automation_practice;

import org.openqa.selenium.By;
import pages.PageObjectRepository;

public class LoginPageObjectRepository extends PageObjectRepository{

    final By emailAddressTextField = By.xpath("//input[@id='email']");
    final By passwordTextField = By.xpath("//input[@id='passwd']");
    final By signInButton = By.xpath("//button[@id='SubmitLogin']");
    final By authenticationFailedLabel = By.xpath("//li[text()='Authentication failed.']");
}
