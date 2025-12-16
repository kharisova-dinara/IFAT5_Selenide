package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    final SelenideElement userInput = $("[id='id_login_email']");
    final SelenideElement passInput = $("[id='id_login_password']");
    final SelenideElement loginBtn = $("[class='sign-form__btn button_with-loader ']");

    public LoginPage openPage() {
        open("catalog?auth=login");
        return this;
    }

    public LoginPage login() {
        userInput.sendKeys("nurutdinovadinara@gmail.ru");
        passInput.setValue("Admin_12345");
        loginBtn.click();
        return this;
    }
}
