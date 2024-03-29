package com.trycloud.step_definitions;



import com.trycloud.pages.US05Page;
import com.trycloud.pages.mainMenuPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US05_StepDefs {



    US05Page us05Page = new US05Page();



    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(3);
        us05Page.actionIcon.click();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string)  {

        BrowserUtils.sleep(3);
        us05Page.addFavorites.click();



    }
    @When("User click the {string} sub-module on the left side")
    public void User_click_the_sub_module_on_the_left_side(String string) {

        BrowserUtils.sleep(4);
        us05Page.Favorites.click();


    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() throws InterruptedException {

    }



}
