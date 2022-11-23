package com.trycloud.step_definitions;

import com.trycloud.pages.US3_Pages;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;




public class US3_StepDefs {

    US3_Pages us3_pages = new US3_Pages();


    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {

        us3_pages.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        us3_pages.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        us3_pages.loginBtn.click();

    }

    @Then("Verify the user see the following modules:")
    public void  verify_the_user_see_the_following_modules(List<String> expectedModuleNames)  {

         List<String> actualModuleNames =   us3_pages.getModulesText();
           Assert.assertEquals(expectedModuleNames,actualModuleNames);

//            BrowserUtils.waitForPageToLoad(30);
//            //Thread.sleep(3000);
//            for (WebElement each : us3_pages.menu){
//                Actions actions = new Actions(Driver.getDriver());
//                actions.moveToElement(each).perform();
//                System.out.println(each.getText());
//                Assert.assertTrue(each.isDisplayed());
//            }



//        BrowserUtils.waitForPageToLoad(30);
//        List<String> actualModuleNames = new ArrayList<>();
//        for (WebElement each : us3_pages.modules) {
//            actualModuleNames.add(each.getAttribute("aria-label"));
//        }
//
//        System.out.println(actualModuleNames);
//        for (int i =0; i<actualModuleNames.size() ; i++) {
//            for (int j=0; j<expectedModules.size() ; j++) {
//               // Assert.assertEquals(expectedModules.get(j), actualModuleNames.get(i));
//                Assert.assertTrue(actualModuleNames.get(i).contains(expectedModules.get(j)));
            }
        }




