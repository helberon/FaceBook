import org.junit.Test;
import page.FacebookPagr;
import page.GooglePage;

public class AuthenticationTest {

    @Test
    public void firstTest(){
        GooglePage g  = new GooglePage();

        g.navigateTo();
        g.fillTheForm();
        g.goToFacebbok();


        FacebookPagr f = new FacebookPagr();
       f.examplMethod();


    }


}

