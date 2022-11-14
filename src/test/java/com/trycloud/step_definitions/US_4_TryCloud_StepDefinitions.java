package com.trycloud.step_definitions;

import com.trycloud.pages.US_4and10TryCloudPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_4_TryCloud_StepDefinitions {


    US_4and10TryCloudPage us_4and10TryCloudPage = new US_4and10TryCloudPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us_4and10TryCloudPage.userNameInput.sendKeys("User15");
        us_4and10TryCloudPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        us_4and10TryCloudPage.loginButton.click();
      
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        us_4and10TryCloudPage.filesModule.click();
        
    }
    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {
        Assert.assertEquals("Files - Trycloud QA", Driver.getDriver().getTitle());
        
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        wait.until(ExpectedConditions.visibilityOf(us_4and10TryCloudPage.topLeftCheckbox));
        us_4and10TryCloudPage.topLeftCheckbox.click();

        
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        Assert.assertTrue(us_4and10TryCloudPage.totalFoldersAndFiles.getText().contains(us_4and10TryCloudPage.selectedFoldersAndFiles.getText()));

    }
}
