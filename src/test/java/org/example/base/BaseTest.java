package org.example.base;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    static WebDriver webDriver = null;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-pop-up-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
        String title = getWebDriver().getTitle();
        String exp_title ="LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki";
        Assert.assertEquals(exp_title,title);
    }

    public static WebDriver getWebDriver(){
        return  webDriver;
    }

    public  static void setWebDriver(WebDriver webDriver){
        BaseTest.webDriver = webDriver;
    }

   @After
    public void tearDown(){
       try {
           TimeUnit.SECONDS.sleep(2);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        getWebDriver().quit();
    }
}
