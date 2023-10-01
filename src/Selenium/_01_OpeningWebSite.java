package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_OpeningWebSite {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.selenium.dev/");

        MyFunctions.Bekle(5);
        driver.quit();//close();
    }
}
