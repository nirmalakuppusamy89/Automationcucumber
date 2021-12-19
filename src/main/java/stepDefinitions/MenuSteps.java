package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MenuSteps extends CommonFunctions {

    private static final Logger LOGGER = LoggerFactory.getLogger(NextBasketTests.class);

    @When("I click on menuBar {string}")
    public void i_click_on_menu_bar(String linkText) {


        String headerText =linkText;
        //Instantiating Actions class
        Actions actions = new Actions(driver);

//Hovering on main menu
        actions.moveToElement(driver.findElement(By.id("NI1")));

//        driver.findElement(By.xpath("//a[contains(text(),'" + linkText +"')]")).click();



        forceWaitForTime(10);

    }
    @Then("I should get redirected to appropriate submenu page with tile as {string}")
    public void i_should_get_redirected_to_appropriate_submenu_page_with_tile_as(String string) {


    }

}
