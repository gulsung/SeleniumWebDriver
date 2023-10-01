package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Odev_01_ {
    /*Odev
        1) -> https://demo.applitools.com/
        2) Username: "tester@gmail.com"
        3) Password: "test1234"
        4) "Sign in" buttonunan tıklayınız.
        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        ilgili locator'ları cssSelector kullanarak ve sibling, child özelliklerini kullanarak bulunuz.*/

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.applitools.com/");

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tester@gmail.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("test1234");

        WebElement signInButton = driver.findElement(By.id("log-in"));
        signInButton.click();

        WebElement branchInfo = driver.findElement(By.cssSelector("#time"));
        String branchText = branchInfo.getText();
        if (branchText.contains("Your nearest branch closes in: 30m 5s")) {
            System.out.println("Başarıyla giriş yapıldı ve uyarı mesajı doğrulandı.");
        } else {
            System.out.println("Uyarı mesajı doğrulanamadı.");
        }
        MyFunctions.Bekle(3);
        driver.quit();
    }
}
