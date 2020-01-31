package page;

import core.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GooglePage {
    @FindBy (xpath = "/html/body/div[6]/div[3]/div[6]/div[1]/div/div/div[2]/div/a[1]")
    private WebElement element;
    @FindBy(name = "q")
    private WebElement searchField;
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/\"]")
    private WebElement facabook;

    public GooglePage(){
        PageFactory.initElements(InitDriver.getDriver(),this);
    }

    public void navigateTo(){
        InitDriver.getDriver().get("https://google.com");
    }

    public void fillTheForm(){
        searchField.sendKeys("Facebook", Keys.ENTER);
    }

    public void goToFacebbok(){
//        element.click();
        facabook.click();
    }
}
