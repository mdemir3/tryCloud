package com.trycloud.pages;




import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


}
