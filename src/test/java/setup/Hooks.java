package setup;

import functionLibrary.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();
    protected WebDriver driver;

    public Hooks() {
        this.driver = CommonFunctions.driver;
    }

    @Before
    public void beforeTest()
    {
        commonFunctions.openBrowser();
    }
    @After
    public void afterTest()
    {
        commonFunctions.closeBrowser();
    }
}
