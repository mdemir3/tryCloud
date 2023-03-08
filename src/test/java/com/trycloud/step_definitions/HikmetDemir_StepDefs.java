package com.trycloud.step_definitions;

import com.trycloud.pages.FilesHD_Page;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class HikmetDemir_StepDefs {
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

        filesHDPage.FolderName.sendKeys("File12");
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {

        filesHDPage.arrow.click();

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(filesHDPage.fileVerify.isDisplayed());

    }
    @Given("user on the home page")
    public void user_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() throws InterruptedException {
        Thread.sleep(5000);
        filesHDPage.threeDot.click();
        Thread.sleep(7000);

    }
    @When("user choose the \"Delete file\\/folder“ option")
    public void user_choose_the_delete_file_folder_option() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        filesHDPage.Delete.click();
        Thread.sleep(3000);
    }
    @When("the user clicks the \"Deleted file\\/folder” sub-module on the left side")
    public void the_user_clicks_the_deleted_file_folder_sub_module_on_the_left_side() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        filesHDPage.DeleteSections.click();
        Thread.sleep(6000);
        filesHDPage.SortDeleted.click();
        Thread.sleep(3000);
        filesHDPage.SortDeleted.click();



        Assert.assertTrue(filesHDPage.DeletedFileVerify.isDisplayed());



    }


}
