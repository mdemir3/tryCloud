package com.trycloud.step_definitions;

import com.trycloud.pages.UploadFilePage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US15 {
    UploadFilePage uploadFilePage = new UploadFilePage();
    @Given("users on the dashboard page")
    public void users_on_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("the user click the {string} module")
    public void the_user_click_the_module(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        uploadFilePage.Contacts.click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(Driver.getDriver().getTitle(),string);


    }

}

