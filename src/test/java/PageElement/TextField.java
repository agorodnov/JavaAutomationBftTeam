package PageElement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class TextField {
    private final SelenideElement selector;
    public TextField(SelenideElement selector) {this.selector = selector; }

    @Step("Получаем значение текстового поля")
    public String textCheck() {
       selector.shouldBe(Condition.enabled, Duration.ofSeconds(30));
        return selector.getText();
    }

    @Step("Получаем текстовое описание логотипа на главной странице")
    public String getLogoAltText() {
        SelenideElement logoElement = $(selector);
        logoElement.shouldBe(Condition.visible, Duration.ofSeconds(30));
        String altText = logoElement.getAttribute("alt");
        return altText != null ? altText : "";
    }
}
