package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactModule {

    public ContactModule(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "/html/body/header/div[1]/ul/li[7]/a")
    public WebElement Contacts;

}

