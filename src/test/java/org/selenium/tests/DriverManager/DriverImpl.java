package org.selenium.tests.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverImpl {

    //initilizing driver

    //quitting driver

    public WebDriver initilizeDriver(String browser) {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.chromedriver().cachePath("Drivers").setup();
        //WebDriverManager.firefoxdriver().cachePath("Drivers").setup();
        //WebDriverManager.edgedriver().cachePath("Drivers").setup();
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver= new FirefoxDriver();
        //WebDriver driver= new EdgeDriver();
        WebDriver driver;
        driver = new ChromeDriver();

        //driver.get("https://askomdch.com/");

        //String localbrowser=System.getProperty("browser",browser);

       /* switch (BrowserType.valueOf(localbrowser)){
            case CHROME:
                WebDriverManager.chromedriver().cachePath("Drivers").setup();
                driver= new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().cachePath("Drivers").setup();
                driver= new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().cachePath("Drivers").setup();
                driver= new EdgeDriver();
                break;
            default:
                throw  new RuntimeException("Choose the correct Browser");*/
        // break;
        //}

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        return driver;

    }
}
