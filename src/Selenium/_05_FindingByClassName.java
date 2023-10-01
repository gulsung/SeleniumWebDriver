package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://form.jotform.com/232061499257057");

        WebElement firstName = driver.findElement(By.className("form-textbox"));
        firstName.sendKeys("Gokhan");

        List<WebElement> ortakClassName = driver.findElements(By.className("form-sub-label"));
        System.out.println(ortakClassName.size());

        for (WebElement e:ortakClassName
             ) {
            System.out.println("e.getText() = " + e.getText());
        }

        MyFunctions.Bekle(3);
        driver.quit();
    }
}

/*package Selenium;

        import Utilities.MyFunctions;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
public class Odev_01_ {

        Odev

        1) -> https://demo.applitools.com/

        2) Username: "tester@gmail.com"

        3) Password: "test1234"

        4) "Sign in" buttonunan tıklayınız.log-in

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

        ilgili locator'ları cssSelector kullanarak ve sibling, child özelliklerini kullanarak bulunuz.


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.get("https://demo.applitools.com/");

        WebElement name = driver.findElement(By.id("username"));
        name.sendKeys("tester@gmail.com");
        //WebElement password = driver.findElement(By.id("log-in"));
        //name.sendKeys("test1234");
        WebElement password = driver.findElement(By.className("form-control"));
        password.sendKeys("test1234");

        WebElement button = driver.findElement(By.id("log-in"));
        button.click();

        MyFunctions.Bekle(3);
        driver.quit();


    }

}*/

