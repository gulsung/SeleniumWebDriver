package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _16_DragAndDrop extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);

        WebElement rome = driver.findElement(By.id("box6"));
        WebElement italy = driver.findElement(By.id("box106"));
        System.out.println(rome.getCssValue("background-color"));

        //1. Yöntem
        //actions.clickAndHold(rome).build().perform();
        //actions.moveToElement(italy).release().build().perform();

        //2. Yöntem
        actions.dragAndDrop(rome, italy).build().perform();

        System.out.println(rome.getCssValue("background-color"));
        Assert.assertTrue("Roma gitmekte inat etti", rome.getCssValue("background-color").equals("rgb(0, 255, 0)"));
        BekleKapat();
    }
}
