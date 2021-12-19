package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;
    public static File configFilePath = new File("screenshots");

    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("screenshots\\screenshot.png"));
        } catch (IOException e) {
            System.out.print("Error while taking screenshot: " + e);
        }

    }

    public void waitForTime(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }

 public String readPropertyFile(String key) throws IOException {
         FileInputStream inputStream = new FileInputStream(configFilePath);
         Properties properties = new Properties();
         properties.load(inputStream);
         return properties.getProperty("url");

 }
    public void forceWaitForTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
