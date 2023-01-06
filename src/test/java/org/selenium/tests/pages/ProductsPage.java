package org.selenium.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.tests.base.BasePage;
import org.testng.Assert;

public class ProductsPage extends BasePage {

   private final By searchProduct= By.xpath("//input[@id='woocommerce-product-search-field-0']");

    private final  By searchField= By.id("woocommerce-product-search-field-0");
    private final By searchBtn=By.xpath("//button[@value='Search']");
    private final By title=By.cssSelector(".woocommerce-products-header__title.page-title");
    private final By addToCartBtn= By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
    private final By linkViewCart= By.cssSelector("a[title='View cart']");

    public ProductsPage(){

    }

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public void selectProduct(){

        driver.findElement(searchProduct).sendKeys("Blue");
        driver.findElement(searchBtn).click();
        String actualValue = driver.findElement(title).getText();
        Assert.assertEquals(actualValue, "Search results: “Blue”");
        driver.findElement(addToCartBtn).click();

    }
}
