import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.PersonalAccountPage;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    LoginPage loginPage;
    PersonalAccountPage personalAccountPage;

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.baseUrl = "https://stepik.org/";
        Configuration.holdBrowserOpen = true;

        loginPage = new LoginPage();
        personalAccountPage = new PersonalAccountPage();
    }

    @AfterMethod
    public void close() {
        clearBrowserCookies();
        closeWebDriver();
    }
}
