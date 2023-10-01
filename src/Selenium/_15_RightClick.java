package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _15_RightClick extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");
        WebElement rightClickButton = driver.findElement(By.id("rightClickButton"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(rightClickButton).contextClick().build(); // contextClick = rightclick
        action.perform();

        MyFunctions.Bekle(2);
        WebElement message = driver.findElement(By.id("rightClickMessage"));
        Assert.assertTrue("Right Click Message", message.isDisplayed());

        BekleKapat();
    }
}
