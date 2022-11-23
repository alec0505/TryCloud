package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_Login_With_Valid_Credentials_Pages {

    public Verify_Login_With_Valid_Credentials_Pages() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "user")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(id = "submit-form")
    public WebElement submitBtn;





}
