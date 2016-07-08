package com.epam.steps.serenity;

import com.epam.pages.DashBoardPage;
import com.epam.pages.LoginPage;
import com.epam.steps.WrappedSteps;
import net.thucydides.core.annotations.Step;

import static com.epam.core.Constants.RED_COLOR;
import static com.epam.pages.DashBoardPage.*;
import static com.epam.pages.LoginPage.*;
import static org.assertj.core.api.Assertions.assertThat;

public class EndUserSteps extends WrappedSteps{
    LoginPage loginPage;
    DashBoardPage dashBoardPage;

    @Step
    public void openLoginPage() {
       openPage(loginPage, "Login");
    }

    @Step
    public void fillInEmail(String email) {
        typeToInput(FIELD_EMAIL, email);
    }

    @Step
    public void fillInPassword(String password) {
        typeToInput(FIELD_PASSWORD, password);
    }

    @Step
    public void pressLoginButton() {
        click(BUTTON_LOGIN);
    }

    @Step
    public void verifyOnDashboardPage() {
        elementShouldContainsOnlyText(PAGE_TITLE, "My Account");
    }

    @Step
    public void verifyLoggedIn() {
        elementShouldBePresent(LOGOUT_BUTTON);
    }

    @Step
    public void verifyErrorMessage() {
        elementShouldBePresent(ERROR_MESSAGE_AUTHENTICATION);
        assertThat(dashBoardPage.element(ERROR_FRAME).getCssValue("color")).isEqualTo(RED_COLOR);
    }
}