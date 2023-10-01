package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://form.jotform.com/232061499257057");

        try{
            WebElement firstName = driver.findElement(By.id("hataliLocator"));

        }catch (Exception e){
            System.out.println("WebElement Locator Hatası " + e.getMessage());
        }


        MyFunctions.Bekle(3);
        driver.quit();


    }
}
