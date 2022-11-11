package com.trycloud.step_definitions;

import com.trycloud.pages.LoginInvalidPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Invalid_Credentials {

    LoginInvalidPage loginInvalidPage = new LoginInvalidPage();

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

   @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String string, String string2) {
       loginInvalidPage.inputUsername.sendKeys(string);
       loginInvalidPage.inputPassword.sendKeys(string2);

   }



    @When("user click the login button")
    public void user_click_the_login_button() {
        loginInvalidPage.loginBtn.click();
    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
        String expectedMsg = loginInvalidPage.warningMsg.getText();
        Assert.assertTrue(expectedMsg.contains(string));


    }


    @Given("user on the login page {string}")
    public void userOnTheLoginPage(String arg0) {
        Driver.getDriver().get(arg0);
    }


}
