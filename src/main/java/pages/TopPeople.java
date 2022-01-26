package pages;

import org.openqa.selenium.WebElement;

public class TopPeople extends BasePage{
    private String PopularPeopleTittle = "//*[@class='title']";
    public String PeopleName = "";

    public WebElement getPopularPeopleTittle(){
        return findElement(PopularPeopleTittle);
    }
}
