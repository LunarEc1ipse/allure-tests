package com.simbirsoft;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "2100x1400";
    }

    @Test
    void githubTest() {
        open("https://github.com/");
        $(".header-search-input").setValue("eroshenkoam/allure-example").pressEnter();
        $(linkText("eroshenkoam/allure-example")).click();
        $("#issues-tab").click();
        $("#issue_81_link").shouldHave(text("issue_to_test_allure_report"));
    }
}
