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


    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement actionIcon;

    //Files Button
    @FindBy(css = "[data-id='files']")
    public WebElement Files;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/ul/li[3]/a")
    public WebElement addFavorites;



}
