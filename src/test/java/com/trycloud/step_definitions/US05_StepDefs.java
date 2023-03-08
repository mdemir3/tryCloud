package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.UploadFilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US05_StepDefs {

    UploadFilePage uploadFilePage = new UploadFilePage();
    LoginPage loginPage = new LoginPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        // Write code here that turns the phrase above into concrete actions
        uploadFilePage.files.click();
    }
    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        uploadFilePage.NewFolder.click();

    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        uploadFilePage.plus.click();
    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);

        uploadFilePage.Upload.sendKeys("/Users/asel/Desktop/Upload.txt");
        Thread.sleep(4000);
    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        uploadFilePage.verifyFile.isDisplayed();
    }



}

