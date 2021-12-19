package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApricotCheckoutTests<string> extends CommonFunctions {

    private static final Logger LOGGER = LoggerFactory.getLogger(NextBasketTests.class);
    private String expectedProductName;

    @When("I search for a product {string} using search option")
    public void i_search_for_a_product_ex_coat_using_search_option(String searchTerm) {

        forceWaitForTime(5);

        driver.switchTo().frame("//");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("getsitecontrol-close")))).click();




        LOGGER.info("clicking the search link");
        waitForTime(5);

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//span[contains(text(),'Search')]")).sendKeys(searchTerm);
        waitForTime(3);


    }
    @When("I got list of search results")
    public void i_got_list_of_search_results() {
        LOGGER.info("opening the first item from the search results");
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/a")).click();
        LOGGER.info("selecting the right size");
        driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div/div/div[1]")).click();

    }
    @Then("I should be able to add products to the bag and checkout")
    public void i_should_be_able_to_add_products_to_the_bag_and_checkout() {
        LOGGER.info("clicking a add to bag button");
        driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

    }

    @Then("verify the checkout confirmation page")
    public void verifyTheCheckoutConfirmationPage() {
        LOGGER.info("Getting actual product name for the in the basket");
        String actualProductName = driver.findElement(By.xpath(
                "//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/strong/a")).getText();
        LOGGER.info("verifying the actual and expected product name");
        Assert.assertEquals(expectedProductName, actualProductName);


    }
}
