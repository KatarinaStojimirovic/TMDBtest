package pages;

import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage {


    private String K_button = "//span[@class='avatar background_color orange']";
    private String ListButton = "//a[@href='//']";
    private String PopularMoviesListButton = "//a[@href='/list/7079788']";
    private String LogOutButton = "(//div[@class='group']//a[@href='/logout'])[2]";


    public WebElement getK_button(){
        return findElement(K_button);
    }
    public WebElement getListButton(){
        return findElement(ListButton);
    }
    public WebElement getPopularMoviesListButton(){
        return findElement(PopularMoviesListButton);
    }
    public WebElement getLogOutButton(){ return findElement(LogOutButton);}



}
