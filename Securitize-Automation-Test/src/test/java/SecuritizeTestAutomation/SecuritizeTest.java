package SecuritizeTestAutomation;

import baseUrl.url;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SecuritizeTest{

    private WebDriver driver;
    LoginPage loginPage;
    TestPage testPage;

    @Before
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        testPage = new TestPage(driver);
        driver = loginPage.chromeDriverConections();

        loginPage.visit(url.TEST);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void login() throws Exception {
        loginPage.login();
    }

    @Test
    public void invalidLogin() throws Exception {
        loginPage.invalidLogin();
    }

    @Test
    public void testDo1Do2Button() throws Exception {
        loginPage.login();
        TestPage testPage = new TestPage(driver);
        testPage.testDo1Do2Button();
    }

    @Test
    public void testChangeFontSize() throws Exception {
        loginPage.login();
        testPage = new TestPage(driver);
        testPage.testChangeFontSize();
    }

    @Test
    public void testBackgroundColor() throws Exception {
        loginPage.login();
        testPage = new TestPage(driver);
        testPage.testBackgroundColor();
    }
}
