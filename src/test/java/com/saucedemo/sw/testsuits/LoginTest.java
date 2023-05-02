package com.saucedemo.sw.testsuits;


import com.saucedemo.sw.pages.LoginPage;
import com.saucedemo.sw.pages.ProductsPage;
import com.saucedemo.sw.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LoginTest extends BaseTest {
    ProductsPage productsPage = new ProductsPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValid() {
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.selectLogin();
        String expectedMessage="Products";
        String actualMessage=productsPage.getTextProducts();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.selectLogin();
        ArrayList<String> products = productsPage.getListOfProductsName();
        int expNo = 6;
        int actNo = products.size();
        Assert.assertEquals(actNo,expNo);
    }


}


