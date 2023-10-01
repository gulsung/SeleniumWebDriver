package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement musteriHizmetleri = driver.findElement(By.linkText("Müşteri Hizmetleri"));
        System.out.println("musteriHizmetleri.getText() = " + musteriHizmetleri.getText());
        System.out.println("musteriHizmetleri.getAttribute(\"href\") = " + musteriHizmetleri.getAttribute("href"));
        System.out.println("musteriHizmetleri.getAttribute(\"href\") = " + musteriHizmetleri.getAttribute("rel"));
        System.out.println("musteriHizmetleri.getAttribute(\"href\") = " + musteriHizmetleri.getAttribute("title"));

        WebElement superFiyat = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("superFiyat.getText() = " + superFiyat.getText());



        MyFunctions.Bekle(3);
        driver.quit();
    }
}
