package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

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
        sendKeys(EMAIL_AREA,"omega0634@hotmail.com");
        return  this;
    }

    public LoginPage sendPassword(){
        sendKeys(PASSWORD_AREA,"deneme123.");
        return this;
    }

    public LoginPage SubmitButton() {
        click(CLICK_BUTTON_LOGIN);
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
        scrollDown();
        return this;
    }




}