package com.saucedemo.sw.pages;

import com.saucedemo.sw.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    public void enterUserName(){
        sendTextToElement(By.id("user-name"), "standard_user");
    }
    public void enterPassword(){
        sendTextToElement(By.id("password"), "secret_sauce");
    }
    public void selectLogin(){
        clickOnElement(By.xpath("//input[@id='login-button']"));
    }
}
