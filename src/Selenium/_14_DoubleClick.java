package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _14_DoubleClick extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(doubleClickButton).doubleClick().build();
        action.perform();

        MyFunctions.Bekle(2);
        WebElement message = driver.findElement(By.id("doubleClickMessage"));

        Assert.assertTrue("Double Click yapılamadı", message.isDisplayed());

        BekleKapat();
    }
}