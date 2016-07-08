package com.epam.steps;

import com.epam.core.enums.Users;
import com.epam.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("I am on Login page.")
    public void openLoginPage() {
        endUser.openLoginPage();
    }

    @When("Entering credential $VALID_USER")
    public void login(Users VALID_USER) {
        endUser.fillInEmail(VALID_USER.getEmail());
        endUser.fillInPassword(VALID_USER.getPassword());
        endUser.pressLoginButton();
    }

    @Then("I get My Account Dashboard page with logged in status.")
    public void verifyLoggedInOnDashboardPage() {
        endUser.verifyOnDashboardPage();
        endUser.verifyLoggedIn();
    }

    @Then("Authentication failed")
    public void verifyFailureAuthentication() {
        endUser.verifyErrorMessage();
    }
}
