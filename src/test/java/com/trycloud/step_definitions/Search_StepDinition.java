package com.trycloud.step_definitions;

import com.trycloud.pages.SearchPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Search_StepDinition {
    SearchPage searchPage = new SearchPage();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        searchPage.userName.sendKeys("User15");
        searchPage.passWord.sendKeys("Userpass123");
        searchPage.login.click();

    }
    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        searchPage.magnifyIcon.click();

    }
    @When("users search any existing file\\/folder\\/user {string} name")
    public void users_search_any_existing_file_folder_user_name(String string) {
        searchPage.searchBox.sendKeys("Documents");
        BrowserUtils.sleep(6);

    }
    @Then("verify the app displays the expected result {string} option")
    public void verify_the_app_displays_the_expected_result_option(String string) {
        Assert.assertTrue(searchPage.documents.isDisplayed());
    }

}
