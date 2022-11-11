package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactTitle_page {

public ContactTitle_page (){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//input[@name='user']")
public WebElement userName;

@FindBy(xpath = "//input[@name='password']")
public WebElement password;

@FindBy(xpath = "//input[@id='submit-form']")
public WebElement loginBtn;

@FindBy(xpath = "//a[@href='/index.php/apps/contacts/']")
    public WebElement contactsButton;



}
