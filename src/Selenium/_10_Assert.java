package Selenium;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _10_Assert extends BaseDriver {
    /*
1.https://demo.seleniumeasy.com/basic-first-form-demo.html adrese git
2.Açılan Sayfada textbox var bu alana mesajı gir
3.Gönder Butonuna tıkla
4.Butona tıkladıktan sonra çıkan mesajın göründüğünü test ile kontrol et
locatorları css ile bul
*/
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String message = "selenium web driver mesaj";
        WebElement textBox = driver.findElement(By.cssSelector("input#user-message"));
        textBox.sendKeys(message);
        WebElement button= driver.findElement(By.cssSelector("button[type='button'][onclick='showInput();']"));
        button.click();

        WebElement assertMessage = driver.findElement(By.cssSelector("span#display"));

        if(assertMessage.getText().equals(message)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test fail");
        }
        BekleKapat();

    }
}
