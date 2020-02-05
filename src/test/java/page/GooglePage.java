package page;

import core.InitDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    @FindBy(name = "q")
    private WebElement searchField;
    @FindBy(xpath = "//a[@href='https://www.facebook.com/']")
    private WebElement facebookLink;

    public GooglePage(String browser){
        if (browser=="Chrome") {
            PageFactory.initElements(InitDriver.getChromeDriver(), this);
        }
        else if (browser == "Firefox") {
            PageFactory.initElements(InitDriver.getFirefoxDriver(), this);
        }
    }

    public void navigateTo(){
        InitDriver.getChromeDriver().get("https://google.com");
    }

    public void fillTheForm(){
        searchField.sendKeys("Facebook", Keys.ENTER);
    }

    public void goToFacebook(){
        facebookLink.click();
    }
}
