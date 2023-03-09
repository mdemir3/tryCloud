package com.trycloud.step_definitions;

import com.trycloud.pages.TC_FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_StepDefs {


    TC_FilesPage tc_filesPage = new TC_FilesPage();


    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {

        tc_filesPage.settingsButton.click();


    }
    @Then("the user should be able to click any checkbox")
    public void the_user_should_be_able_to_click_any_checkbox() {
        BrowserUtils.sleep(2);

        Assert.assertTrue(tc_filesPage.showRichWorkPlaceCheckbox.isEnabled());
        Assert.assertTrue(tc_filesPage.showHiddenFilesCheckbox.isEnabled());
        Assert.assertTrue(tc_filesPage.showRichWorkPlaceCheckbox.isEnabled());


    }


}
