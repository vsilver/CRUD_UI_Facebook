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

public class CRUDTest {

    private WebDriver driver;
    private TestBase testBase;
    private ProfilePage profilepage;

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
        profilepage = new ProfilePage(driver);
        testBase = new TestBase(driver);
    }


    @Test
    public void createPost(){
        login = MYLOGIN;
        pass = MYPASS;
        testBase.logIn(login, pass);
        profilepage.createNewPost();
    }

    @Test
    public void upadePost(){
        login = MYLOGIN;
        pass = MYPASS;
        testBase.logIn(login, pass);
        profilepage.clickOnOption();
        profilepage.editPost();
    }

    @Test
    public void deletePost(){
        login = MYLOGIN;
        pass = MYPASS;
        testBase.logIn(login, pass);
        profilepage.deletePost();

    }

}
