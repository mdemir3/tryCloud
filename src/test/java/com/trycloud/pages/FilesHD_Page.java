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
    @FindBy(css="[data-file='file13']")
    public WebElement fileVerify;

    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement threeDot;

    @FindBy(xpath ="//*[@i='fileList']/tr[1]/td[2]/a/span[2]/a[2]")
    public WebElement Delete;
   ////
    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[7]/a")
    public WebElement DeleteSections;
    ////*[@id="app-navigation"]/ul/li[7]/a

    @FindBy(xpath = "//*[@id='filestable']/thead/tr/th[3]/a")
    public WebElement SortDeleted;

    ////*[@id="modified"]/span[1]
    ////*[@id="filestable"]/thead/tr
////*[@id="headerDate"]
    @FindBy(xpath = "*[@id='fileList']/tr[1]")
    public WebElement DeletedFileVerify;
    ////*[@id="fileList"]/tr[1]
    ////*[@id="fileList"]/tr[1]/td[1]

    ////*[@id="fileList"]/tr[1]/td[2]/div/ul/li[8]/a

}
