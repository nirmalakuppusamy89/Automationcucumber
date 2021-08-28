package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchTests extends CommonFunctions {

    private static final Logger LOGGER = LoggerFactory.getLogger(NextBasketTests.class);

    @Given("I'm on Home Page {string}")
    public void i_m_on_home_page(String url) {

        LOGGER.info("Opening the home page");
        driver.get(url);

    }

    @When("I enter searchTerm {string}")
    public void i_enter_search_term(String searchTerm) {
        LOGGER.info("Entering the search term");
        driver.findElement(By.id("sli_search_1")).sendKeys(searchTerm);

    }

    @When("I click searchIcon")
    public void i_click_search_icon() {
        LOGGER.info("User clicks search button");
        driver.findElement(By.xpath("//*[@id=\"newsearch\"]/input[4]")).click();

    }

    @Then("I should get redirected to results page with heading as {string}")
    public void i_should_get_redirected_to_results_page_with_heading_as(String expectedSearchTerm) {
        LOGGER.info("Getting the actual search term value");
        String actualSearchTerm = driver.findElement(By.xpath("//*[@id=\"ResultHeader\"]/div[1]/h1/div")).getText();
        LOGGER.info("Verifying the search text");
        Assert.assertEquals(expectedSearchTerm, actualSearchTerm);

    }



}
