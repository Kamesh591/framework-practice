package org.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckoutTest {


    @Test
    public void checkoutProductusingGuestUser() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.get("https://askomdch.com");
        driver.findElement(By.cssSelector("#menu-item-1227 a")).click();
        driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']")).sendKeys("Blue");
        driver.findElement(By.cssSelector(".woocommerce-product-search button")).click();
        String actualValue = driver.findElement(By.cssSelector(".woocommerce-products-header h1")).getText();
        Assert.assertEquals(actualValue, "Search results: “Blue”");
        driver.findElement(By.xpath("//a[@aria-label=\"Add “Blue Shoes” to your cart\"]")).click();
        //  Thread.sleep(5000);
        driver.findElement(By.cssSelector(".added_to_cart")).click();
        String productText = driver.findElement(By.cssSelector(".product-name >a")).getText();
        Assert.assertEquals(productText, "Blue Shoes");
        driver.findElement(By.cssSelector(".wc-proceed-to-checkout >a")).click();

        Assert.assertEquals(driver.getTitle(), "Checkout – AskOmDch");


        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("Jangry");
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("Jilebi");
        driver.findElement(By.cssSelector("#billing_company")).sendKeys("JJGroup");
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("James2");
        driver.findElement(By.cssSelector("#billing_address_2")).sendKeys("Backside of House");
        driver.findElement(By.cssSelector("#billing_city")).sendKeys("Lohagon");
        driver.findElement(By.cssSelector("#billing_postcode")).clear();
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("52334");
        driver.findElement(By.cssSelector("#billing_email")).sendKeys("james.ghruau@wucsdj.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[name='woocommerce_checkout_place_order']")).click();
        String orderConfirmationText = driver.findElement(By.cssSelector(".woocommerce-order >p")).getText();
        Assert.assertEquals(orderConfirmationText, "Thank you. Your order has been received.");
        driver.close();
    }

    @Test
    public void checkoutProductasLoginUser() throws InterruptedException {
        /*WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.get("https://askomdch.com");*/
      //  driver.findElement(By.cssSelector("#menu-item-1227 a")).click();
        driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']")).sendKeys("Blue");
        driver.findElement(By.cssSelector(".woocommerce-product-search button")).click();
        String actualValue = driver.findElement(By.cssSelector(".woocommerce-products-header h1")).getText();
        Assert.assertEquals(actualValue, "Search results: “Blue”");
        driver.findElement(By.xpath("//a[@aria-label=\"Add “Blue Shoes” to your cart\"]")).click();
        //  Thread.sleep(5000);
        driver.findElement(By.cssSelector(".added_to_cart")).click();
        String productText = driver.findElement(By.cssSelector(".product-name >a")).getText();
        Assert.assertEquals(productText, "Blue Shoes");
        driver.findElement(By.cssSelector(".wc-proceed-to-checkout >a")).click();

        Assert.assertEquals(driver.getTitle(), "Checkout – AskOmDch");

        driver.findElement(By.cssSelector(".woocommerce-form-login-toggle a")).click();
        driver.findElement(By.id("username")).sendKeys("Kamesh591");
        driver.findElement(By.cssSelector("#password")).sendKeys("Welcome123");
        driver.findElement(By.cssSelector(".woocommerce-form-login__submit")).click();
        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("Jangry");
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("Jilebi");
        driver.findElement(By.cssSelector("#billing_company")).sendKeys("JJGroup");
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("James2");
        driver.findElement(By.cssSelector("#billing_address_2")).sendKeys("Backside of House");
        driver.findElement(By.cssSelector("#billing_city")).sendKeys("Lohagon");
        driver.findElement(By.cssSelector("#billing_postcode")).clear();
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("52334");
        driver.findElement(By.cssSelector("#billing_email")).clear();
        driver.findElement(By.cssSelector("#billing_email")).sendKeys("james.ghruau@wucsdj.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[name='woocommerce_checkout_place_order']")).click();
        String orderConfirmationText = driver.findElement(By.cssSelector(".woocommerce-order >p")).getText();
        Assert.assertEquals(orderConfirmationText, "Thank you. Your order has been received.");
        driver.close();

    }
}
