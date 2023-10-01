package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Odev_03_ {

    /*Odev
        Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        Calculator'e tıklayınız.
        İlk input'a herhangi bir sayı giriniz.
        İkinci input'a herhangi bir sayı giriniz.
        Select yardımı ile minus seçeneğini seçiniz
        Calculate button'una tıklayınız.
        Sonucu alınız.
        Sonucu yazdırınız.
        Ana sayfaya back ile gidiniz ve url ile doğrulama işlemi yapınız.
         Xpath ile locator bulma işlemi yapınız*/

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculatorLink = driver.findElement(By.linkText("Calculator"));
        calculatorLink.click();

        WebElement firstInput = driver.findElement(By.xpath("//input[@name='number1']"));
        firstInput.sendKeys("5");

        WebElement secondInput = driver.findElement(By.xpath("//input[@name='number2']"));
        secondInput.sendKeys("3");

        Select operationSelect = new Select(driver.findElement(By.id("function")));
        operationSelect.selectByVisibleText("minus");

        WebElement calculateButton = driver.findElement(By.xpath("//input[@type='submit']"));
        calculateButton.click();

        WebElement result = driver.findElement(By.id("answer"));
        String sonuc = result.getText();

        System.out.println("Sonuç: " + sonuc);

        driver.navigate().back();

        String currentURL = driver.getCurrentUrl();
        if (currentURL.equals("https://testpages.herokuapp.com/styled/index.html")) {
            System.out.println("URL doğrulama başarılı.");
        } else {
            System.out.println("URL doğrulama başarısız.");
        }

        MyFunctions.Bekle(2);
        driver.quit();
    }
}