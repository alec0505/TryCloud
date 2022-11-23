package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@class='password-with-toggle']")
    public WebElement passWord;

    @FindBy(xpath = "//input[@class='login primary']")
    public WebElement login;

    @FindBy(xpath = "(//span[@aria-label='Magnify icon']//*)[1]")
    public WebElement magnifyIcon;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchBox;

    @FindBy(xpath = "(//h3[@class='unified-search__result-line-one']//*)[1]")
    public WebElement documents;
}
