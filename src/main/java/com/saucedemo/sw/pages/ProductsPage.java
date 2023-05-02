package com.saucedemo.sw.pages;


import com.saucedemo.sw.utilities.Utility;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class ProductsPage extends Utility {
    public String getTextProducts(){
        return getTextFromElement(By.xpath("//span[@class='title']"));
    }


    public ArrayList<String> getListOfProductsName() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//div[@class='inventory_item_name']"));
        return products;
    }
}
