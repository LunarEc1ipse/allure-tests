package com.simbirsoft;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.simbirsoft.TestData.*;
import static org.openqa.selenium.By.linkText;

public class SelenideTest extends TestBase {

    @Test
    void githubTest() {
        open(URL);
        $(".header-search-input").setValue(REPOSITORY).pressEnter();
        $(linkText(REPOSITORY)).click();
        $("#issues-tab").click();
        $("#issue_81_link").shouldHave(text(ISSUE_NAME));
    }
}
