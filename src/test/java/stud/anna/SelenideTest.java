package stud.anna;

import com.codeborne.selenide.logevents.SelenideLogger;

public class SelenideTest {

SelenideLogger.addListener("allure", new AllureSelenide());
    open("https://github.com");

}
