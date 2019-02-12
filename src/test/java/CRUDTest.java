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
    private final static String MYLOGIN = "soqejwqizt_1549640997@tfbnw.net";
    private final static String MYPASS = "MyDochka1";

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

    }

    ProfilePage profilepage = new ProfilePage(driver);

    @Test
    public void createPost(){
        login = MYLOGIN;
        pass = MYPASS;
        logIn(login, pass);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        profilepage.createNewPost();
    }

    @Test
    public void upadePost(){
        login = MYLOGIN;
        pass = MYPASS;
        logIn(login, pass);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        profilepage.clickOnOption();
        profilepage.editPost();
    }

    @Test
    public void deletePost(){
        login = MYLOGIN;
        pass = MYPASS;
        logIn(login, pass);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        profilepage.deletePost();

    }

}
