package pages;

import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{

    private String UsernameField = "//input[@id='username']";
    private String PasswordField = "//input[@id='password']";
    private String LoginButton = "//input[@id='login_button']";



    public WebElement getUsernameField(){
        return findElement(UsernameField);
    }
    public WebElement getPasswordField(){
        return findElement(PasswordField);
    }
    public WebElement getLoginButton(){
        return findElement(LoginButton);
    }

}
