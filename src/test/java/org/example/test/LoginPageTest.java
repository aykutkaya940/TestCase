package org.example.test;

import org.example.base.BaseTest;
import org.example.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//Note
public class LoginPageTest extends BaseTest{
    LoginPage loginPage;

    @Before
    public  void before(){
        loginPage = new LoginPage(getWebDriver());
    }

    @Test
    public void test(){
        loginPage.clickLogIn().sendEmail().sendPassword().SubmitButton().search().clickButton().scroll();
    }

    @After
    public void after(){
      //  tearDown();
    }
}

