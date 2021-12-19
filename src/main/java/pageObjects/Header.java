package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(id="sli_search_1")
    public WebElement searchTxtFld;

    @FindBy(xpath="//input[@class='SearchButton']")
    public WebElement searchIcon;

    public void enterSearchTerm(String searchTerm)
    {
        searchTxtFld.sendKeys(searchTerm);
    }
}
