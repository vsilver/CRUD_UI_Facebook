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
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import static org.junit.Assume.assumeTrue;

public class ProfilePage {

    private WebDriver driver;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }


    private By newpost = By.xpath("//div[@class='_5rpb']");
    private By sharebutton = By.xpath("//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']");
    private By taponoption = By.xpath("//div[@class='_6a uiPopover _5pbi _cmw _b1e _1wbl']//a[@aria-label='Story options']");
    private By deletepost = By.xpath("//div[@class='_54ng']//span[contains(text(),'Delete')]");
    private By editpost = By.xpath("//div[@class='_54ng']//span[contains(text(),'Edit Post')]");


    public ProfilePage writeMessage(){

        driver.findElement(newpost).click();
        driver.findElement(newpost).sendKeys("Hi, It's new post");
        return this;
    }

    public ProfilePage pressShareButton(){
        driver.findElement(sharebutton).click();
        return this;
    }

    public ProfilePage createNewPost(){
        this.writeMessage();
        this.pressShareButton();
        return this;
    }

    public ProfilePage clickOnOption (){
        driver.findElement(taponoption).click();
        return this;
    }

    public ProfilePage editPost(){
        driver.findElement(editpost).click();
        return this;
    }

    public ProfilePage deletePost(){
        driver.findElement(deletepost).click();
        return this;
    }

    public ProfilePage confirmDeleting(){

        return this;
    }





}
