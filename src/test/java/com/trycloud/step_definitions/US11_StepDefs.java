package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TC_FilesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_StepDefs {

    TC_FilesPage tc_filesPage = new TC_FilesPage();
    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

        tc_filesPage.actionIcon.click();

    }

    @When("user choose the Details option")
    public void user_choose_the_details_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
