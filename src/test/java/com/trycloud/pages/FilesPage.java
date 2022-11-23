package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }

  //  @FindBy(xpath = "")


    @FindBy(xpath = "//tr[1]//a[@data-action='menu']")
    public WebElement actionIcon;

    @FindBy (xpath = "//*[@class='filename']//*[@class='innernametext']")
    public WebElement favFileName;

    @FindBy (xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li[3]//span[2]")
    public WebElement firstOption;

    @FindBy(xpath = "//a[text()='Favorites']")
    public WebElement favoritesButton;

    @FindBy (xpath = "//tr[1]//span[@class='innernametext']")
    public WebElement fileName;

    private static String fileNameH;
    public static String getFileNameHolder() {
        return fileNameH;
    }

    public static void setFileNameHolder(String fileNameHolder) {
        fileNameH = fileNameHolder;
    }









}
