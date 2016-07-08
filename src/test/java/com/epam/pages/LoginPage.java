package com.epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Andrii_Chorniak on 6/17/2016.
 */
@DefaultUrl("https://www.magentocommerce.com/products/customer/account/login")
public class LoginPage extends PageObject {

    @FindBy(name = "login[username]")
    public static WebElementFacade FIELD_EMAIL;

    @FindBy(name = "login[password]")
    public static WebElementFacade FIELD_PASSWORD;

    @FindBy(name = "send")
    public static WebElementFacade BUTTON_LOGIN;
}
