package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_FilesPage {

    public TC_FilesPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionIcon;

    @FindBy (xpath = "//span[normalize-space()='Remove from favorites']")
    public WebElement removeFromFavoritesButton;

    @FindBy (xpath = "//a[normalize-space()='Favorites']")
    public WebElement favoriteSubModule;

    @FindBy (xpath = "//td[@class='filename']//span[@class='innernametext'][normalize-space()='New folder']")
    public WebElement folderInFavorites;

    @FindBy (xpath = "//h2[.='No favorites yet']")
    public WebElement noFavoritesYet;







}
