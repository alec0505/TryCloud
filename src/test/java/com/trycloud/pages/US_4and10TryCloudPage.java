package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_4and10TryCloudPage {
    public US_4and10TryCloudPage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='user']")
    public WebElement userNameInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@value='Log in']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@aria-label='Files']")
    public WebElement filesModule;

    @FindBy (xpath = "//label[@for='select_all_files']")
    public WebElement topLeftCheckbox;

    @FindBy (xpath = "//td[@class='filesummary']")
    public WebElement totalFoldersAndFiles;

    @FindBy (css = "div[id='app-content-files'] a[class='name sort columntitle'] span:nth-child(1)")
    public WebElement selectedFoldersAndFiles;

    @FindBy (xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;

    @FindBy (xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement showRichWorkSpacesBtn;



    @FindBy (xpath = "//label[@for='recommendationsEnabledToggle']")
    public WebElement showRecommendationsBtn;

    @FindBy (xpath = "//label[@for='showhiddenfilesToggle']" )
    public WebElement showHiddenFilesBtn;

    @FindBy (css = "a[class='icon-quota svg'] p")
    public WebElement storageUsage;

    @FindBy (css = ".button.new")
    public WebElement plusButton;

    @FindBy (xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileOption;





}