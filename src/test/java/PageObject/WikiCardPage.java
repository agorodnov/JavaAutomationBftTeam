package PageObject;


import PageElement.Input;
import PageElement.TextField;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class WikiCardPage {
     protected final TextField textField = new TextField($x("//span[text()='Java']"));
     protected final TextField checkLogo = new TextField($("div#mw-mf-page-center>header>div>div>a>span>img"));
     protected final Input searchField = new Input ($("#searchInput"));
     protected final Input searchFieldInput = new Input ($x("(//input[@name='search'])[2]"));

    @Step ("Клик на поиск")
    public WikiCardPage clickSearchField(){
        searchField.click();
        return this;
    }

    @Step ("Вводим значение в поиск")
    public WikiCardPage setSearchField(String value){
        searchFieldInput.setValue(value);
        actions().sendKeys(Keys.ENTER).perform();
        return this;
    }

    @Step("Проверка лого Википедия на странице")
    public WikiCardPage verifyWikipediaImageAltText() {
        String altText = checkLogo.getLogoAltText();
        Assertions.assertEquals("Википедия", altText, "Атрибут alt изображения не соответствует ожидаемому значению");
        return this;
    }

    @Step("Проверка ввода текста на на странице java ")
    public WikiCardPage verifyWikipediaTextIsPresent(){
        String getText = textField.textCheck();
        Assertions.assertEquals("Java", getText, "текст не соотвествует java");
        return this;
    }
}
