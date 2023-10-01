package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://form.jotform.com/232061499257057");

        WebElement firstName = driver.findElement(By.name("q3_isim[first]"));
        firstName.sendKeys("GokhanEren");

        MyFunctions.Bekle(3);
        driver.quit();
    }
}
