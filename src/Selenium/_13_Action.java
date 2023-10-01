package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class _13_Action extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //clickMe.click();
        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(clickMe).click().build();
        System.out.println("Aksiyonu tanımladım ve yapılandırdım");
        MyFunctions.Bekle(2);

        action.perform();
        System.out.println("Aksiyonu tamamladım");

        WebElement message = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue("Click işlemi yapılamadı",message.isDisplayed());

        BekleKapat();
    }
}