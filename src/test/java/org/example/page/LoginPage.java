package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.example.constants.Constants.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage moveToLogIn(){
        hoverElement(MOVE);
        return  this;
    }

    public LoginPage clickLogIn() {
        click(LOG_IN);
        return  this;
    }

    public LoginPage sendEmail(){
        sendKeys(EMAIL_AREA,"_email_");
        return  this;
    }

    public LoginPage sendPassword(){
        sendKeys(PASSWORD_AREA,"_pass_");
        return this;
    }

    public LoginPage SubmitButton()  {
        click(CLICK_BUTTON_LOGIN);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       logControl(findElement(LOG_CONTROL).getText());
        return  this;
    }

    public LoginPage search(){
        sendKeys(SEARCH_AREA,"pantolan");
        return  this;
    }

    public LoginPage clickButton(){
        click(CLICK_BUTTON);
        return  this;
    }

    public LoginPage scroll(){
        click(LOAD_MORE_BUTTON);
        randItemPıcker();
        getPrice();
        click(CREATE_RANDOM_OPT);
        return this;
    }

    public LoginPage cart(){
        click(ADD_TO_THE_CART);
        return this;
    }

    public LoginPage goToCartP(){
        click(GO_TO_THE_CART);
        priceAssertion();
        click(ADD_QUANTITY);
        click(DELETE);
        click(POP_UP_DEL);
        return this;
    }
}
