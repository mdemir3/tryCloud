package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.mainMenuPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class mainMenuStepDefs {
    mainMenuPage menuPage = new mainMenuPage();

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> dataTable) throws InterruptedException {
        List<String> each = new ArrayList<>();

       for (WebElement element : menuPage.appMenu) {
           Thread.sleep(2000);
           each.add(element.getAttribute("aria-label"));
           if (element.isEnabled()){
               System.out.println("element is "+element.getAttribute("aria-label")+" clickable");
           }else{
               System.out.println("element is "+element.getAttribute("aria-label")+ " is not clickable");
           }

       }

       Assert.assertTrue(each.containsAll(dataTable));



    }
}