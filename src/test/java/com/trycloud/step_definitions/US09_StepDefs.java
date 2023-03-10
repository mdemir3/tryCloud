package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US05Page;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.TreeMap;

public class US09_StepDefs {

    BasePage basePage = new BasePage();

    US05Page us05Page = new US05Page();



    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

        us05Page.FolderOpen.click();

    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() throws InterruptedException {

        us05Page.uploadIcon.click();
        Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(us05Page.upLoadPlus).sendKeys(Keys.ARROW_DOWN)
                .sendKeys("C:\\Users\\ztpol\\Desktop\\CYDEO\\Interview");
    }


  //  us05Page.uploadIcon.sendKeys("C:\\Users\\ztpol\\Desktop\\CYDEO\\Interview");





    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() throws InterruptedException {
        Thread.sleep(3000);
        us05Page.FolderOpen.click();

    }



}