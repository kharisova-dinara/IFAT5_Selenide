package pages;

import com.codeborne.selenide.SelenideElement;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BaseTest {
    final SelenideElement userInput = $("[id='id_login_email']");
    final SelenideElement passInput = $("[id='id_login_password']");
    final SelenideElement loginBtn = $("[class='sign-form__btn button_with-loader ']");

    public LoginPage openPage() {
        open("catalog?auth=login");
        return this;
    }

    public LoginPage login(String user, String password) {
        userInput.sendKeys(user);
        passInput.setValue(password);
        loginBtn.click();
        return this;
    }
}
