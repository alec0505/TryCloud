package com.trycloud.step_definitions;

import com.trycloud.pages.ContactTitle_page;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ContactTitle_StepDef {

    ContactTitle_page conctactPage = new ContactTitle_page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        conctactPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        conctactPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        conctactPage.loginBtn.click();


    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
    conctactPage.contactsButton.click();


    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {


        Assert.assertEquals("Contacts - Trycloud QA",Driver.getDriver().getTitle());
    }
}
