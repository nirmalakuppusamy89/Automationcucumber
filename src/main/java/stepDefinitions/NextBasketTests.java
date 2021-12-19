package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NextBasketTests extends CommonFunctions {

    private static final Logger LOGGER = LoggerFactory.getLogger(NextBasketTests.class);
    private String expectedProductName;


    @And("click the first item from results page")
    public void click_the_first_item_from_results_page() {

        LOGGER.info("Getting the selected product name");
        expectedProductName = driver.findElement(
                By.xpath("//*[@id=\"i1\"]/section/div[1]/h2/a/span")).getText();

        LOGGER.info("Selecting and opening the first item from the search results");
        driver.findElement(By.xpath("//*[@id=\"i1\"]/section/div[1]/h2/a/span")).click();

    }

    @And("select the size for the item")
    public void select_the_size_for_the_item() {

        LOGGER.info("Clicking on the size dropdown");
        driver.findElement(By.xpath("//*[@id=\"dk_container_Size-955-639\"]/a")).click();

        LOGGER.info("Selecting the right size");
        driver.findElement(By.xpath("//*[@id=\"dk_container_Size-955-639\"]/div/ul/li[3]/a")).click();

    }
    @And("click add to bag button")
    public void click_add_to_bag_button() {
        LOGGER.info("Clicking the add to bag button");
        driver.findElement(By.xpath("//a[contains(text(),'ADD TO BAG')]")).click();

    }
    @Then("verify the actual item name in the basket")
    public void verify_the_actual_item_name() {

        LOGGER.info("Clicking the basket icon");
        driver.findElement(By.id("gel-bag-summary")).click();

        LOGGER.info("Clicking view/edit bag button");
        driver.findElement(By.xpath("/html/body/header/div[2]/section/div[4]/div[3]/a[1]")).click();

        LOGGER.info("Getting actual product name for the in the basket");
        String actualProductName = driver.findElement(By.xpath("//*[@id=\"1\"]/td[2]/div/h3")).getText();

        LOGGER.info("verifying the actual and expected product name");
        Assert.assertEquals(expectedProductName, actualProductName);


    }



}
