package com.simbirsoft;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.simbirsoft.TestData.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepTest extends TestBase {

    @Test
    void githubTest() {

        step("Открываем главную страницу", () -> {
            open(URL);
        });
        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").setValue(REPOSITORY).pressEnter();
        });
        step("Переходим в репозиторий " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Открываем раздел Issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем название Issues " + ISSUE_NAME, () -> {
            $("#issue_81_link").shouldHave(text(ISSUE_NAME));
        });
    }
}