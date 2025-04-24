package PageElement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

public class Input {
    private final SelenideElement selector;
    public Input (SelenideElement selector) {this.selector = selector; }

    @Step("Вводим данные в поле ввода")
    public void setValue(String value) {
        assertThat($(selector).shouldBe(visible, Duration.ofSeconds(30))).as(
                "Интуп недоступен или не успел прогрузится");
        selector.click();
        $(selector).setValue(value);
    }

    @Step("Нажимаем кнопку")
    public void click() {
        assertThat($(selector).shouldBe(visible, Duration.ofSeconds(30))
                .as("Кнопка недоступна в течении 30 секунд"));
        $(selector).click();
    }
}
