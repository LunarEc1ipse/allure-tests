package com.simbirsoft;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Открываем главную страницу {url}")
    public void openMainPage(String url) {
        open(url);
    }
    @Step("Ищем репозиторий {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").setValue(repository).pressEnter();
    }
    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }
    @Step("Открываем раздел Issues")
    public void openIssuesTab() {
        $("#issues-tab").click();
    }
    @Step("Проверяем название Issues {issueName}")
    public void shouldIssueWithNumber(String issueName) {
        $("#issue_81_link").shouldHave(text(issueName));
    }
}
