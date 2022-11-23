package com.trycloud.step_definitions;

import com.trycloud.pages.Verify_Login_With_Valid_Credentials_Pages;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Verify_Login_With_Valid_Credentials_StepDefinitions {
    Verify_Login_With_Valid_Credentials_Pages login_pages = new Verify_Login_With_Valid_Credentials_Pages();

    @Given("user on the login page {string}")
    public void user_on_the_login_page(String link) {
        Driver.getDriver().get(link);
    }
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String password) {
        login_pages.usernameBox.sendKeys(username);
        login_pages.passwordBox.sendKeys(password);
    }


    @Given("user click the login button")
    public void user_click_the_login_button() {
        login_pages.submitBtn.click();

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));


    }
}
