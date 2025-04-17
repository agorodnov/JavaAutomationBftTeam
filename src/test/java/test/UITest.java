package test;

import Settings.TestConfiguration;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class UITest extends TestConfiguration {
    @Test
    @DisplayName("Переход на стартовую страницу Википедии ввод данных")
    void openPageCheck() {
        Selenide.open("https://ru.m.wikipedia.org/wiki/");
        $("#searchInput").click();
        $x("(//input[@name='search'])[2]").setValue("Java").pressEnter();
        Assertions.assertEquals("Википедия", $x("//img[@alt='Википедия']").getAttribute("alt"));
        Assertions.assertEquals("Java", $x("//span[text()='Java']").getText());
        sleep(6000);
    }
}
