package com.trycloud.pages;


import com.trycloud.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Story9_Page {
    public Story9_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement filesButton;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[3]")
    public WebElement actionIconButton;

    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']")
    public WebElement detailsButton;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentButton;

    @FindBy(xpath = "//div[@contenteditable='true']")
    public WebElement commentBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement postButton;

    @FindBy(xpath = "(//div[@class='message'])[1]")
    public WebElement message;
}

