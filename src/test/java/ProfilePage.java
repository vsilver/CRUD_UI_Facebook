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

public class ProfilePage extends TestBase {
    WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;

    }

    //private By newpost = By.xpath("//div[@class='_1mf _1mj']");
    //private By sharebutton = By.xpath("//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']");

    public ProfilePage writeMessage(){
        driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).click();
        driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Hi, It's new post");
        return this;
    }

    public ProfilePage pressShareButton(){
        driver.findElement(By.xpath("//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")).click();
        return this;
    }

    public ProfilePage createNewPost(){
        this.writeMessage();
        this.pressShareButton();
        return this;
    }



}
