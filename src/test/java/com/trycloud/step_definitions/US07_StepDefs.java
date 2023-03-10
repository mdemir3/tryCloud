package com.trycloud.step_definitions;


import com.trycloud.pages.LoginPage;
import com.trycloud.pages.UploadFilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

public class US07_StepDefs {

    UploadFilePage uploadFilePage = new UploadFilePage();
    LoginPage loginPage = new LoginPage();



    @When("the user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        uploadFilePage.plus.click();
    }
    @And("users uploads file with the “upload file” option")
    public void usersUploadsFileWithTheUploadFileOption() throws InterruptedException {

        // Write code here that turns the phrase above into concrete actions
        String absolutePath = new File("/Users/asel/Desktop/Upload.docx").getAbsolutePath();
        uploadFilePage.Upload.sendKeys(absolutePath);
        Thread.sleep(3000);


        Thread.sleep(4000);
    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        uploadFilePage.verifyFile.isDisplayed();
    }



}

