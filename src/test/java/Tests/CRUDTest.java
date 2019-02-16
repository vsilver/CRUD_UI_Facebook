package Tests;

import Pages.LoginPage;
import Pages.ProfilePage;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import static org.junit.Assume.assumeTrue;

public class CRUDTest {

    private WebDriver driver;
    private LoginPage loginpage;
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
        loginpage = new LoginPage(driver);
    }


    @Test
    public void createPost(){
        login = MYLOGIN;
        pass = MYPASS;
        loginpage.logIn(login, pass);
        profilepage.createNewPost();
    }

    @Test
    public void upadePost(){
        login = MYLOGIN;
        pass = MYPASS;
        loginpage.logIn(login, pass);
        profilepage.clickOnOption();
        profilepage.editPost();
    }

    @Test
    public void deletePost(){
        login = MYLOGIN;
        pass = MYPASS;
        loginpage.logIn(login, pass);
        profilepage.deletePost();

    }

}
