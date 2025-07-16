package base;

import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://iris.vrfoundations.in/");
    }

    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }

}