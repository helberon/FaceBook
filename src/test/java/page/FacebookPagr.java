package page;

import core.InitDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPagr {

    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement loginField;

    public FacebookPagr(){
        PageFactory.initElements(InitDriver.getDriver(),this);
    }

    public void examplMethod(){
        loginField.sendKeys("login");
    }
}
