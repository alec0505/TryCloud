package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_5_Favorites_File_StepDefinitions {




    DashboardPage dashboardPage=new DashboardPage();
    FilesPage filesPage=new FilesPage();
    LoginPage loginPage=new LoginPage();

    @Given("the users should be on dashboard page")
    public void theUsersShouldBeOnDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        //some errors fixed
        //second minor fix
    }
    @When("the user clicks the files module")
    public void theUserClicksTheFilesModule() {
        dashboardPage.FilesModule.click();


    }
    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        filesPage.actionIcon.click();

    }
    @And("user choose the Add to {string} option")
    public void userChooseTheAddToOption(String option) {


        String currentFileName = filesPage.fileName.getText();
        System.out.println(currentFileName);

        if (option.contains("favorites") && !filesPage.firstOption.getText().equals(option)) {
            filesPage.firstOption.click();
            BrowserUtils.highlight(filesPage.actionIcon);
            filesPage.actionIcon.click();
            FilesPage.setFileNameHolder(currentFileName);

        } else {
            FilesPage.setFileNameHolder(currentFileName);

        }
    }
    @And("user click the Favorites sub-module on the left side")
    public void userClickTheFavoritesSubModuleOnTheLeftSide() {
        filesPage.favoritesButton.click();

    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

        String expectedName=filesPage.favFileName.getText();
        System.out.println(expectedName);
        Assert.assertEquals(FilesPage.getFileNameHolder(), expectedName);

    }


}
