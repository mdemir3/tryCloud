package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05Page {
    public US05Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "[data-id='favorites']")
    public WebElement Favorites;


    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement actionIcon;

    @FindBy(xpath = "//tr[@data-id][4]")
    public WebElement chooseFile;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addFavorites;



}
