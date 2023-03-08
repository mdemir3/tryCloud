package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TC_FilesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US06_StepDeffs {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    TC_FilesPage tc_filesPage = new TC_FilesPage();



    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        tc_filesPage.actionIcon.click();
        tc_filesPage.noFavoritesYet.getText();

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        tc_filesPage.removeFromFavoritesButton.click();

    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

        tc_filesPage.favoriteSubModule.click();
    }

    @Then("Verify that the file is not listed in the Favorites table")
    public void verify_that_the_file_is_not_listed_in_the_favorites_table() {


    String expectedResult = "No favorites yet";
    String actualResult = tc_filesPage.noFavoritesYet.getText();

    Assert.assertEquals(actualResult,expectedResult);





    }





}