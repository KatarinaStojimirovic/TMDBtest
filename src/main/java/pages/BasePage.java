package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;

public class BasePage {
    public void printMessage(String x) {
        System.out.println("Vrednost elementa je "+x);
    }


    public WebElement findElement(String xpath){
        return Browser.getBrowser().findElementByXPath(xpath);
    }
    public WebElement findElementByName (String name){
        return Browser.getBrowser().findElementByName(name);
    }
    public WebElement findElementById (String id) { return Browser.getBrowser().findElementById(id);}
}