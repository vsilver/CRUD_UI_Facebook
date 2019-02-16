package Pages;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assume.assumeTrue;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginButton = By.id("loginbutton");

    public LoginPage typeUseName(String username){
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public ProfilePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new ProfilePage(driver);
    }

    public ProfilePage logIn(String username, String password){
        this.typeUseName(username);
        this.typePassword(password);
        this.clickLoginButton();
        return new ProfilePage(driver);
    }

    @After
    public void closeConnect() throws Exception {
        driver.quit();
    }
}
