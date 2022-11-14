package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactListFunctionPage_US13 {

    public ContactListFunctionPage_US13() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//input[@id='user']")
  public  WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(id = "submit-form")
    public WebElement submit;

    @FindBy( xpath = "(//li[@data-id='contacts']/a/*)[1]")
    public WebElement contactList;


     @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")

    public List<WebElement> contacts;







}
