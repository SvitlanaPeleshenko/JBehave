package com.epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by Andrii_Chorniak on 6/17/2016.
 */
@DefaultUrl("https://www.magentocommerce.com/products/customer/account/")
public class DashBoardPage extends PageObject {

    @FindBy(xpath = "//a[@href='/products/customer/account/']")
    public static WebElementFacade PAGE_TITLE;

    @FindBy(xpath = "//a[contains(@href,'logout')]")
    public static WebElementFacade LOGOUT_BUTTON;

    @FindBy(xpath = "//*[text()='Invalid login or password.']")
    public static WebElementFacade ERROR_MESSAGE_AUTHENTICATION;

    @FindBy(xpath = "//li[@class='error-msg']")
    public static WebElementFacade ERROR_FRAME;

}
