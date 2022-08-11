package SecuritizeTestAutomation;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project.pom.Base;

@Getter
public class LoginPage extends Base {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Login Elements //

    By userNameLogin = By.xpath("//input[@placeholder=\'username\']");
    By passwordLogin = By.xpath("//input[@placeholder=\'password\']");
    By submitLogin = By.xpath("//button[contains(text(),'login')]");
    By errorMessage = By.id("errField");
    By welcomePage = By.id("welcomeMsg");

    public void login() throws Exception {
        String admin = "admin";

        type(admin, userNameLogin);
        type(admin, passwordLogin);
        click(submitLogin);
        isDisplayed(welcomePage);

    }

    public void invalidLogin() throws Exception {

        type("asdsa", userNameLogin);
        type("sfdsdg", passwordLogin);
        click(submitLogin);
        isDisplayed(errorMessage);

    }
}
