package com.trycloud.pages;




import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public  class FilesHD_Page {
    public FilesHD_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //Files Button
    @FindBy(css = "[data-id='files']")
    public WebElement Files;

    //"+" icon button
    @FindBy(css="[class='button new']")
    public WebElement icon;

    //New Folder button
    @FindBy(css = "[data-templatename='New folder']")
    public WebElement newFolder;

    //Writing File Name
    @FindBy(id = "view13-input-folder")
    public WebElement FolderName;
//"-->" button
    @FindBy(css="[class='icon-confirm']")
    public WebElement arrow;
//Creating File Name
    @FindBy(css="[data-file='File12']")
    public WebElement fileVerify;

    @FindBy(xpath = "//tr[@data-file='File12']/td[2]/a[1]/span[3]/a[2]")
    public WebElement threeDot;




    @FindBy(css = "[data-action='Delete']")
    public WebElement Delete;


    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[7]/a")
    public WebElement DeleteSections;

   @FindBy(xpath = "//*[@id=\"app-content-trashbin\"]/table/thead/tr/th[3]/a[1]")
    public WebElement SortDeleted;


    @FindBy(xpath = "//tr[@data-path='File12']")
    public WebElement DeletedFileVerify;



}
