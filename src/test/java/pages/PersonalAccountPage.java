package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PersonalAccountPage {
    final SelenideElement trainingTab = $x("//*[text()='Моё обучение']");
    final SelenideElement selectedCourses = $x("//*[text()='Избранные']");
    final SelenideElement title = $x("//*[text()='Избранные курсы']");
    final ElementsCollection courses = $$x("//*[@class='item-tile__link-wrapper']");

    public void waitOpen() {
        trainingTab.click();
        selectedCourses.click();
        title.should(exist).shouldBe(visible);
        courses.shouldHave(size(2));
    }
}
