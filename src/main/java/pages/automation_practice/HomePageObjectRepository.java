package pages.automation_practice;

import org.openqa.selenium.By;
import pages.PageObjectRepository;

public class HomePageObjectRepository extends PageObjectRepository {

    final String url = "http://automationpractice.com/index.php";
    final By signInButton = By.xpath("//a[@class='login']");
}
