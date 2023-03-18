package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessFilesModule {

    public AccessFilesModule(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/thead/tr/th[1]/label")
    public WebElement checkBox;


    @FindBy(xpath = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> checkBoxes;
}
