package com.trycloud.step_definitions;


import com.trycloud.pages.US_4and10TryCloudPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_10_TryCloud_StepDefinitions {

    US_4and10TryCloudPage us_4and10TryCloudPage = new US_4and10TryCloudPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
    double beforeUploadUsage = 0.0;
    double afterUploadUsage =0.0;

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        us_4and10TryCloudPage.settingsButton.click();

    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons()
    {
        //us_4and10TryCloudPage.showRichWorkSpacesBtn.click();
        BrowserUtils.waitForClickability(us_4and10TryCloudPage.showRichWorkSpacesBtn,5);
        BrowserUtils.waitForClickability(us_4and10TryCloudPage.showRecommendationsBtn,5);
        BrowserUtils.waitForClickability(us_4and10TryCloudPage.showHiddenFilesBtn,5);

    }

    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        String current = us_4and10TryCloudPage.storageUsage.getText();
       current= current.substring(0,current.indexOf(" "));
       beforeUploadUsage = Double.valueOf(current);
        System.out.println(beforeUploadUsage);


    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() throws InterruptedException
    {
        wait.until(ExpectedConditions.visibilityOf(us_4and10TryCloudPage.plusButton));

        us_4and10TryCloudPage.plusButton.click();
       Thread.sleep(5000);
        us_4and10TryCloudPage.uploadFileOption.sendKeys("/Users/viktoriiaprotsan/Downloads/B_27!.pdf");
       Thread.sleep(5000);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("uploadprogressbar")));


    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();

    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
        wait.until(ExpectedConditions.visibilityOf(us_4and10TryCloudPage.storageUsage));
        String actual = us_4and10TryCloudPage.storageUsage.getText();
        actual= actual.substring(0,actual.indexOf(" "));
        afterUploadUsage = Double.valueOf(actual);
        System.out.println(afterUploadUsage);

        Assert.assertTrue(afterUploadUsage> beforeUploadUsage);



    }


}
