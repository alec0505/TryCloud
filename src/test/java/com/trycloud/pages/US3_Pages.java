package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US3_Pages {

    public US3_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;


    @FindBy(xpath = "//ul[@id='appmenu']//li" )
    public List<WebElement> modules;


    public List<String> getModulesText() {

        List<String> modulesText = new ArrayList<>();
        for (int i = 0; i < modules.size() - 1; i++) {

            BrowserUtils.hover(modules.get(i));
            BrowserUtils.sleep(1);
            modulesText.add(modules.get(i).getText());

        }
        return modulesText;


    }

}
