package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;

public class _11_AssertMethods extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String message = "selenium web driver mesaj";

        WebElement textBox = driver.findElement(By.cssSelector("input#user-message"));
        textBox.sendKeys(message);

        WebElement button = driver.findElement(By.cssSelector("button[type='button'][onclick='showInput();']"));
        button.click();

        WebElement assertMessage = driver.findElement(By.cssSelector("div#user-message > label"));

        //WebElement assertMessage = driver.findElement(By.cssSelector("span#display"));
        //Assert.assertTrue("Mesaj ile sonuç uyuşmadı", assertMessage.getText().equals(message) ); // Pozitif test
        Assert.assertFalse("Mesaj ile sonuç uyuşmadı", assertMessage.getText().equals(message) ); // Negatif test

        BekleKapat();
    }

}