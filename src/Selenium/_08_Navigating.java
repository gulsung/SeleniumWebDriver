package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        WebElement element = driver.findElement(By.id("fakealerttest"));
        element.click();

        MyFunctions.Bekle(2);
        System.out.println( "driver.getCurrentUrl() = "+driver.getCurrentUrl());
        MyFunctions.Bekle(2);

        driver.navigate().back();
        System.out.println( "driver.getCurrentUrl() = "+driver.getCurrentUrl());
        MyFunctions.Bekle(2);

        driver.navigate().forward();
        System.out.println( "driver.getCurrentUrl() = "+driver.getCurrentUrl());



        BekleKapat();
    }
}
