package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInvalidPage {

    public LoginInvalidPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "user")
    public WebElement inputUsername;

    @FindBy (id = "password")
    public WebElement inputPassword;

    @FindBy (id = "submit-form")
    public WebElement loginBtn;

    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMsg;
}
