package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement searchButton;

   @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchBox;

   @FindBy(xpath= "//h3[@class='unified-search__result-line-one']")
    public WebElement documentSearched;
}

