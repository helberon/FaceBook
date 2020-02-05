package page;

import core.InitDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;

public class FacebookPage {

    @FindBy (xpath = "//*[@id='email']")
    private WebElement loginField;
    @FindBy (xpath = "//*[@id='pass']")
    private WebElement passwordField;
    @FindBy (xpath = "//*[@id='u_0_b']")
    private WebElement loginButton;
    @FindBy (xpath = "//div[@role='alert']")
    private WebElement badLoginAlert;

    public FacebookPage(String browser){
        if (browser=="Chrome") {
            PageFactory.initElements(InitDriver.getChromeDriver(), this);
        }
        else if (browser == "Firefox") {
            PageFactory.initElements(InitDriver.getFirefoxDriver(), this);
        }
    }

    public void enterBadCredentials(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();

    }
    public String verifyAlert(){
        return badLoginAlert.getText();
    }
}
