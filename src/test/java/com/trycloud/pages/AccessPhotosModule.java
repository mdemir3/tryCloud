package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessPhotosModule {

    public AccessPhotosModule(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@data-id='photos']/a")
    public WebElement photos;

    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public List<WebElement> sub_modules;


}
