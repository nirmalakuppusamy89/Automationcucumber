package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HeaderSteps extends CommonFunctions {

    private static final Logger LOGGER = LoggerFactory.getLogger(NextBasketTests.class);

    @When("I click on headerLink {string}")
    public void i_click_on_headerLink(String linkText) {

        LOGGER.info("User clicks the header link");
        driver.findElement(By.xpath("//a[contains(text(),'" + linkText +"')]")).click();




    }
    @Then("I should get redirected to appropriate page with tile as {string}")
    public void i_should_get_redirected_to_appropriate_page(String expectedPageTitleText) {
        String actualPageTitle = driver.getTitle();
        LOGGER.info("verifying the page title");
        waitForTime(3);
        System.out.println(actualPageTitle);
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitleText));

    }



}
