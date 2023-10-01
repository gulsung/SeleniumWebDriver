package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_FindById {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.get("https://form.jotform.com/232061499257057");

        WebElement name = driver.findElement(By.id("first_3"));
        name.sendKeys("gokhan");
        WebElement surname = driver.findElement(By.id("last_3"));
        surname.sendKeys("eren");
        WebElement email = driver.findElement(By.id("input_4"));
        email.sendKeys("gokhan@gmail.com");
        WebElement phoneNumber = driver.findElement(By.id("input_5_full"));
        phoneNumber.sendKeys("5555555555");
        WebElement button = driver.findElement(By.id("input_2"));
        button.click();

        MyFunctions.Bekle(3);
        driver.quit();
    }
}
