package com.trycloud.step_definitions;


import com.trycloud.pages.Story9_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Story9 {

    Story9_Page story9 = new Story9_Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        story9.username.sendKeys("User15");
        story9.password.sendKeys(ConfigurationReader.getProperty("password"));
        story9.loginBtn.click();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        story9.filesButton.click();


    }
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(3);
        story9.actionIconButton.click();


    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        story9.detailsButton.click();


    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        BrowserUtils.sleep(3);
        story9.commentButton.click();

    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        BrowserUtils.sleep(3);
        story9.commentBox.sendKeys("something");
        story9.postButton.click();


    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        Assert.assertTrue(story9.message.isDisplayed());


    }

}
