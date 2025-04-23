package Settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestConfiguration {
    private static void setlocalDriver (){
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920х1080";
        Configuration.pageLoadTimeout = 600000;
    }

    @BeforeEach
    void setDriver(){
        setlocalDriver();
        Selenide.open("https://ru.m.wikipedia.org/wiki/");
    }
    @AfterEach
    void tearDown(){
        Selenide.closeWebDriver();
    }
}
