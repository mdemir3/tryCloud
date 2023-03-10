package com.trycloud.step_definitions;


import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TC_FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US11_StepDefs {

    TC_FilesPage tc_filesPage = new TC_FilesPage();

    LoginPage loginPage = new LoginPage();

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(2);
        tc_filesPage.actionIcon.click();

    }

    @When("user choose the Details option")
    public void user_choose_the_details_option() {
        BrowserUtils.sleep(2);
        tc_filesPage.detailsSubModule.click();

    }



    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {

        String text = "hello World";

        tc_filesPage.commentsButton.click();
        tc_filesPage.commentsBox.sendKeys(text);



    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

    tc_filesPage.commentButtonToPost.click();

    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

        BrowserUtils.sleep(2);
        String expectedText ="hello World";
        String actualText = tc_filesPage.messageComment.getText();
        Assert.assertEquals(actualText,expectedText);

    }



}
