import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import static org.junit.Assume.assumeTrue;

public class TestBase {

    public WebDriver driver;

    public TestBase(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginButton = By.id("loginbutton");

    public TestBase typeUseName(String username){
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public TestBase typePassword(String password){
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
