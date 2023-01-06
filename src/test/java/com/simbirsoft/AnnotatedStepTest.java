package com.simbirsoft;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.simbirsoft.TestData.*;

public class AnnotatedStepTest extends TestBase {

    @Test
    @DisplayName("Проверка названия Issues")
    @Severity(SeverityLevel.BLOCKER)
    public void testGithub() {
        WebSteps steps = new WebSteps();
        steps.openMainPage(URL);
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldIssueWithNumber(ISSUE_NAME);
    }
}
