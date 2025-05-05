package test;
import PageObject.WikiCardPage;
import Settings.TestConfiguration;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.SeverityLevel.MINOR;

public class UITest extends TestConfiguration {
    WikiCardPage wikiCardPage = new WikiCardPage();

    @Test
    @DisplayName("Переход на стартовую страницу Википедии ввод данных")
    @Owner("Городнов Александр")
    @Severity(MINOR)
    void openPageCheck() {
        wikiCardPage.clickSearchField()
        .setSearchField("Java")
        .verifyWikipediaImageAltText()
        .verifyWikipediaTextIsPresent();
        sleep(6000);
    }

    @Test
    @DisplayName("Подсчет размера коробки (Box)")
    @Owner("Городнов Александр")
    @Severity(MINOR)

}
