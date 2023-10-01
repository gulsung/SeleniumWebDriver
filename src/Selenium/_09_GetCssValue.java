package Selenium;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _09_GetCssValue extends BaseDriver {

    public static void main(String[] args) {
        driver.get("https://snapdeal.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#inputValEnter"));
        System.out.println( "searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));


        System.out.println( "searchBox.getCssValue(\"color\") = " + searchBox.getCssValue("color"));
        System.out.println( "searchBox.getCssValue(\"font-size\") = " + searchBox.getCssValue("font-size"));
        System.out.println( "searchBox.getCssValue(\"background-color\") = " + searchBox.getCssValue("background-color"));
        BekleKapat();

    }
}
