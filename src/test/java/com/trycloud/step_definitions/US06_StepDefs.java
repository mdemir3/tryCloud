package com.trycloud.step_definitions;

import com.trycloud.pages.FilesHD_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US06_StepDefs {
    FilesHD_Page filesHDPage = new FilesHD_Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {



    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        filesHDPage.Files.click();
    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() throws InterruptedException {

        Thread.sleep(5000);
      filesHDPage.icon.click();

    }
    @When("user click \"new folder”")
    public void user_click_new_folder() {
        // Write code here that turns the phrase above into concrete actions
        filesHDPage.newFolder.click();

    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {
        // Write code here that turns the phrase above into concrete actions

        filesHDPage.FolderName.sendKeys("file13");
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {

        filesHDPage.arrow.click();

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(filesHDPage.fileVerify.isDisplayed());

    }
}
