package org.example.base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import static org.example.constants.Constants.*;

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
     public void randItemPıcker(){
         List<WebElement> allProducts = driver.findElements(ITEMS);
         Random rand = new Random();
         int randomProduct = rand.nextInt(allProducts.size());
         allProducts.get(randomProduct).click();

     }
     public String productPrice;
     public void getPrice(){
        productPrice = findElement(PRODUCT_DETAIL_PRICE).getText();

     }
     public void priceAssertion(){
         String b =findElement(CART_PRICE).getText();
         Assert.assertEquals(productPrice,b);
     }
     public void logControl(String ab){
         String check ="Hesabım";
         Assert.assertEquals(check,ab);
     }

    public String getText(By by){
        wait.until(webdriver ->ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }
}
