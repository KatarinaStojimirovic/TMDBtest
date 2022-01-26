import browser.Browser;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.TMDB;
import pages.TopPeople;



import java.util.ArrayList;
import java.util.List;

public class SmokeTest extends BaseTest {

    @Before
    public void testSetup() {
        Browser.getBrowser().get("https://www.themoviedb.org/");
        Browser.getBrowser().manage().window().maximize();
    }


    @Test
    public void LogInAndLogOutTest(){
        tmdb.getHomePage().getLogInButton().click();
        tmdb.getSignInPage().getUsernameField().sendKeys("KatarinaTest");
        tmdb.getSignInPage().getPasswordField().sendKeys("Test123");
        tmdb.getSignInPage().getLoginButton().click();
        tmdb.getMyAccountPage().getK_button().click();
        Assert.assertEquals("K",tmdb.getMyAccountPage().getK_button().getText());
        tmdb.getMyAccountPage().getLogOutButton().click();
        Assert.assertEquals("Login",tmdb.getHomePage().getLogInButton().getText());

    }

    @Test
    public void SearchResultTest(){
        tmdb.getHomePage().getSearchField().sendKeys("The Batman");
        tmdb.getHomePage().getSearchIcon().click();
        Assert.assertTrue(tmdb.getHomePage().getFirstSearchResult().getText().contains("The Batman"));

    }

    @Test
    public void OpenTeaserTest() throws InterruptedException {
        tmdb.getHomePage().getSearchField().sendKeys("The Batman");
        tmdb.getHomePage().getSearchIcon().click();
        tmdb.getHomePage().getFirstSearchResult().click();
        tmdb.getMovieDetailsPage().getPlayTeaserButton().click();
        Thread.sleep(3000);
        Assert.assertTrue(tmdb.getMovieDetailsPage().getPlayTeaserButton().isDisplayed());

    }

    @Test
    public void PopularPeopleTest(){
        tmdb.getHomePage().getPeopleButton().click();
        tmdb.getHomePage().getPopularPeopleButton().click();
        ArrayList <TopPeople> Top20 = new ArrayList<>();
        List <WebElement> listOfPeople = Browser.getBrowser().findElements(By.xpath("//div[@class='fifty_square']"));
        for (WebElement i:listOfPeople){
            TopPeople Actor = new TopPeople();
            Actor.PeopleName = i.findElements(By.tagName("a")).get(1).getText();

            Top20.add(Actor);
        }
        Assert.assertEquals(20,Top20.size());
    }









}