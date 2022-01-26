package pages;


import org.openqa.selenium.WebElement;

public class MovieDetailsPage extends BasePage{

    private String MovieName = "//h2[@class='10']";
    private String PlayTeaserButton = "//li[@class='video none']";
  //  private String PlayButton = "play-icon-title";


    public WebElement getMovieName(){
        return findElement(MovieName);
    }
    public WebElement getPlayTeaserButton(){ return findElement(PlayTeaserButton); }
        // public WebElement getPlayButton(){ return findElementById(PlayButton); }
}
