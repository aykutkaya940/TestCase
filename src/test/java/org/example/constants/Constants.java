package org.example.constants;

import org.openqa.selenium.By;
import java.util.Random;

public class Constants {
    public static Random rand = new Random();
    public static final By MOVE= By.className("dropdown-label");
    public static final By LOG_IN = By.className("dropdown-label");
    public static final By EMAIL_AREA = By.id("LoginEmail");
    public static final By PASSWORD_AREA = By.id("Password");
    public static final By SEARCH_AREA = By.id("search_input");
    public static final By CLICK_BUTTON = By.tagName("BUTTON");
    public static final By CLICK_BUTTON_LOGIN = By.id("loginLink");
    public static final By LOAD_MORE_BUTTON = By.className("lazy-load-button");
    public static final By ADD_TO_THE_CART = By.id("pd_add_to_cart");
    public static final By GO_TO_THE_CART = By.cssSelector("body > div:nth-child(13) > div" +
            ".container-fluid.header > div:nth-child(2) > div.col-md-3.col-" +
            "sm-3.col-xs-6.col-lg-2.pull-right > div > div.col-sm-4.col-xs-4.header-cart-section > a > i");
    public static final By ADD_QUANTITY = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div/div[1]/div/a[2]");
    public static final By DELETE = By.className("cart-square-link");
    public static final By PRODUCT_DETAIL_PRICE =By.cssSelector("#rightInfoBar > div:nth-child(1) > div > div:nth-child(3) > div > div > div > span.price");
    public static final By CART_PRICE = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/span");
    public static final By ITEMS= By.className("a_model_item");
    public static final By POP_UP_DEL = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div/div/div[3]/div/div/a[1]");
    public static final By LOG_CONTROL = By.className("dropdown-label");

    private static int rnd = rand.nextInt(1,5);
    public static final By CREATE_RANDOM_OPT = By.xpath("/html/body/div[5]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div[1]/div[3]/a["+rnd+"]");
}
