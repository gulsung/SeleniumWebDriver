package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _17_DragAndDropBy extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement priceRange = driver.findElement(By.id("amount"));

        System.out.println("priceRange.getText() = " + priceRange.getText());
        String message1 = priceRange.getText();
        Actions actions = new Actions(driver);

        WebElement leftHandle = driver.findElement(By.cssSelector("div#slider-range > *:nth-child(2)"));

        Action action = actions.dragAndDropBy(leftHandle, 100,0).build();
        action.perform();

        System.out.println("priceRange.getText() = " + priceRange.getText());

        String message2 = priceRange.getText();
        Assert.assertFalse("Eşit geldi", message1.equals(message2));

        BekleKapat();
    }
}
