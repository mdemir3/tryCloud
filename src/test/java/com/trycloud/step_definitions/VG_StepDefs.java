package com.trycloud.step_definitions;

import com.trycloud.pages.AccessFilesModule;
import com.trycloud.pages.AccessPhotosModule;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VG_StepDefs {


    AccessFilesModule accessFilesModule = new AccessFilesModule();
    AccessPhotosModule accessPhotosModule = new AccessPhotosModule();
    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, "Files - Trycloud QA");
    }




    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {

        accessFilesModule.checkBox.click();

    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {



        for(WebElement each : accessFilesModule.checkBoxes) {
           if(!(each.isSelected())){
               Assert.fail();
           }
        }
    }


    @When("the user clicks the Photos module")
    public void theUserClicksThePhotosModule() {

        accessPhotosModule.photos.click();

    }

    @Then("verify there are following sub-modules")
    public void verifyThereAreFollowing(List<String> expectedModules) {

        List<String> actual = new ArrayList<>();
       for(WebElement each : accessPhotosModule.sub_modules){
          actual.add(each.getText());
       }

        Assert.assertEquals(actual, expectedModules);

    }
}
