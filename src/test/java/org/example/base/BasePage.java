package org.example.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver = null;
    WebDriverWait wait = null;

    public BasePage(WebDriver driver){
        this.driver =driver;
        this.wait = new WebDriverWait(driver,60);
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return  driver.findElement(by);
    }

    public void sendKeys(By by,String text){
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }

    public void  click(By by){
        wait.until(webdriver -> ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
     public void scrollDown(){
        // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

         WebElement loadMore = driver.findElement(By.className("lazy-load-button"));
         Actions actionMore = new Actions(driver);
         actionMore.moveToElement(loadMore).click().build().perform();
         List<WebElement> allProducts = driver.findElements(By.className("a_model_item"));
         Random rand = new Random();
         int randomProduct = rand.nextInt(allProducts.size());
         allProducts.get(randomProduct).click();
     }




    public String getText(By by){
        wait.until(webdriver ->ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }


}
