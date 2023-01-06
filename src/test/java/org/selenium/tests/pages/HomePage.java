package org.selenium.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.tests.base.BasePage;

public class HomePage extends BasePage {
    //driver.findElement(By.cssSelector("#menu-item-1227 a")).click();

    By storeMenu=By.cssSelector("#menu-item-1227 a");

    public HomePage(){

    }
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickStoreMenu(){
        driver.findElement(storeMenu).click();
    }
}
