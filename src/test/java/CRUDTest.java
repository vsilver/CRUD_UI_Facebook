import org.junit.Test;
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

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRUDTest extends TestBase {

    private String login;
    private String pass;
    private final static String mylogin = "soqejwqizt_1549640997@tfbnw.net";
    private final static String mypass = "MyDochka1";

    By title = By.id("pageTitle");

    @Test
    public void successfullLoginTest(){
        login = mylogin;
        pass = mypass;
        logIn(login, pass);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(title));

        Assert.assertEquals(title, driver.getTitle());
    }


}
