package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {
    public UploadFilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "[data-id='files']")
    public WebElement files;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]")
    public WebElement NewFolder;


    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/a")
    public WebElement plus;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/label")
    public WebElement Upload;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr")
    public WebElement verifyFile;
}
