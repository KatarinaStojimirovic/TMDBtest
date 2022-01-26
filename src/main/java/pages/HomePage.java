package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private String LogoButton = "//a[@class='logo']/child::img[1]";
    private String LogInButton = "//ul[@class='primary']/child::li[3]";
    private String JoinTMDbButton = "//ul[@class='primary']/child::li[4]";
    private String SearchField = "//input[@id='inner_search_v4']";
    private String SearchIcon = "//input[@value='Search']";
    private String FirstSearchResult = "//a[@class='result']/child::h2[1]";
    private String PeopleButton = "(//a[@href='/person'])[1]";
    private String PopularPeopleButton = "(//a[@class='k-link k-menu-link'])[9]";


    //private String TwitterLink = "//a[@href='https://twitter.com/themoviedb']";








   public WebElement getLogoButton(){
       return findElement(LogoButton);
   }
   public WebElement getLogInButton(){
       return findElement(LogInButton);
   }
   public WebElement getJoinTMDbButton(){
       return findElement(JoinTMDbButton);
   }
   public WebElement getSearchField(){
       return findElement(SearchField);
   }
   public WebElement getSearchIcon(){
       return findElement(SearchIcon);
   }
   public WebElement getFirstSearchResult(){
       return findElement(FirstSearchResult);
   }
   public WebElement getPeopleButton(){ return findElement(PeopleButton);}
   public WebElement getPopularPeopleButton(){ return findElement(PopularPeopleButton);}


  // public WebElement getTwitterLink(){return findElement(TwitterLink);}




}
