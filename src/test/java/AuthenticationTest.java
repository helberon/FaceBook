import core.InitDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import page.FacebookPage;
import page.GooglePage;

public class AuthenticationTest {

    @Test
    public void badLoginFacebookViaChrome(){
        GooglePage g  = new GooglePage("Chrome");
        g.navigateTo();
        g.fillTheForm();
        g.goToFacebook();
        FacebookPage f = new FacebookPage("Chrome");
        f.enterBadCredentials("badlogin","badpassword");
        Assert.assertEquals("The email or phone number you’ve entered doesn’t match any account. Sign up for an account.", f.verifyAlert());
    }

    @Test
    public void badLoginFacebookViaFirefox(){
        GooglePage g  = new GooglePage("Firefox");
        g.navigateTo();
        g.fillTheForm();
        g.goToFacebook();
        FacebookPage f = new FacebookPage("Firefox");
        f.enterBadCredentials("badlogin","badpassword");
        Assert.assertEquals("The email or phone number you’ve entered doesn’t match any account. Sign up for an account.", f.verifyAlert());
    }

    @After
    public void closePage(){
        InitDriver.closeDriver();
    }
}

