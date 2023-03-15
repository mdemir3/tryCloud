package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.SearchPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class searchBoxSteps {
    SearchPage searchPage = new SearchPage();

    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        searchPage.searchButton.click();
    }
    @And("users search any existing {string} user name")
    public void usersSearchAnyExistingUserName(String file) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);
        wait.until(ExpectedConditions.elementToBeClickable(searchPage.searchBox));
        searchPage.searchBox.sendKeys(file+ Keys.ENTER);
        //searchPage.searchBox.clear();
    }

    @Then("verify the app displays the expected result {string}")
    public void verifyTheAppDisplaysTheExpectedResult(String file) {
        String document = searchPage.documentSearched.getText();
        Assert.assertEquals(document,file );
        searchPage.documentSearched.click();
    }
}
