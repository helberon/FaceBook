import core.InitDriver;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import page.FacebookPage;
import page.GooglePage;

import java.io.File;
import java.io.IOException;

public class AuthenticationTest {

    @Test
    public void badLoginFacebook(){
        GooglePage g  = new GooglePage();
        g.navigateTo();
        g.fillTheForm();
        g.goToFacebbok();
        FacebookPage f = new FacebookPage();
        f.enterBadCredentials("badlogin","badpassword");
        Assert.assertEquals("The email or phone number you’ve entered doesn’t match any account. Sign up for an account.", f.verifyAlert());
    }

    @After
    public void closePage(){
        InitDriver.closeDriver();
    }
}

