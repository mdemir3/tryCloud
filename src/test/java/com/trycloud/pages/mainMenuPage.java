package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class mainMenuPage {
    public mainMenuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//*[@id='appmenu']/li/a")
    public List<WebElement> appMenu;




}
