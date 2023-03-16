package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_FilesPage {

    public TC_FilesPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='action action-menu permanent']")
    public WebElement actionIcon;

    @FindBy(xpath = "//tr[@data-type='dir']//a[@class='action action-menu permanent']")
    public WebElement actionIcon2;

    @FindBy (xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFavoritesButton;

    @FindBy (xpath = "//a[.='Favorites']")
    public WebElement favoriteSubModule;

    @FindBy (xpath = "//td[@class='filename']//span[@class='innernametext'][normalize-space()='New folder']")
    public WebElement folderInFavorites;

    @FindBy (xpath = "//h2[.='No favorites yet']")
    public WebElement noFavoritesYet;

    @FindBy (xpath = "//span[.='Details']")
    public WebElement detailsSubModule;

    @FindBy (xpath = "html/body/div[3]/aside/div/nav/ul/li[2]/a")
    public WebElement commentsButton;

    ///html/body/div[3]/aside/div/nav/ul/li[3]/a
    ///html/body/div[3]/aside/div/nav/ul/li[2]/a

    ///
    @FindBy (xpath = "//div[@data-placeholder='New comment …']")
    public WebElement commentsBox;

    @FindBy (xpath = "(//div[@class='message'])[2]")
    public WebElement messageComment;

    @FindBy (xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement commentButtonToPost;

    @FindBy (xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;

    @FindBy (xpath = "//label[.='Show rich workspaces']")
    public WebElement showRichWorkPlaceCheckbox;

    @FindBy (xpath = "//label[.='Show recommendations']")
    public WebElement showRecommendationCheckbox;

    @FindBy (xpath = "//label[.='Show hidden files']")
    public WebElement showHiddenFilesCheckbox;

}
