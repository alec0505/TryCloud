package com.trycloud.step_definitions;

import com.trycloud.pages.ContactListFunctionPage_US13;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class ContactListFunction_US13 {

    ContactListFunctionPage_US13 contactListFunctionPage_us13=new ContactListFunctionPage_US13();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        contactListFunctionPage_us13.username.sendKeys("User15");
        contactListFunctionPage_us13.password.sendKeys(ConfigurationReader.getProperty("password"));
        contactListFunctionPage_us13.submit.click();
    }
    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        contactListFunctionPage_us13.contactList.click();
    }


    @Then("verify the contact names are in the list")
    public void verifyTheContactNamesAreInTheList() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app-content-list-item-line-one']")));
        //Thread.sleep(3000);
       Assert.assertTrue( contactListFunctionPage_us13.contacts.size()>0);
        for (WebElement each: contactListFunctionPage_us13.contacts) {
            System.out.println(each.getText());
        }


    }

    }







