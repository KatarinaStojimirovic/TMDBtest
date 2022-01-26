import browser.Browser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.TMDB;

public class BaseTest {
    protected static TMDB tmdb;


    @BeforeClass
    public static void setup(){
        tmdb = new TMDB();
    }
    @AfterClass
    public static void cleanup(){
        Browser.getBrowser().close();
    }
}
