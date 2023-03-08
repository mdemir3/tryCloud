package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")


    public void the_user_logged_in_as() {
        //based on input enter that user information

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @When("user use username and passcode")
    public void userUseUsernameAndPasscode() {

        // Write code here that turns the phrase above into concrete actions

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.submit.click();

    }



}