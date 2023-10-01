package Selenium;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Odev_02_ {
    /*
       Odev

    1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    2- Personal use radio butonunu seçin
    3- How did you discover XYZ? altındaki Search Engine'i seçin
    4- Less Than Once a Week'i seçin
    5- Average'ı seçin
    6- How long have you been using XYZ? altındaki I'm not using XYZ yet, but I will in the future seçeneğini seçin
    7- What is your favorite feature? kısmına bir text girin
    css selector kullanarak senaryonuzu oluşturun. Select tanımlı olan yerlerde seçimler için select kullanın
     */


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement personalUseRadio = driver.findElement(By.cssSelector("input[value='Personal use']"));
        personalUseRadio.click();

        Select discoverSelect = new Select(driver.findElement(By.cssSelector("#u_3im_4588")));
        discoverSelect.selectByVisibleText("Search Engine");

        WebElement frequencyRadio = driver.findElement(By.cssSelector("input[value='Less Than Once a Week']"));
        frequencyRadio.click();

        WebElement satisfactionRadio = driver.findElement(By.cssSelector("input[value='Average']"));
        satisfactionRadio.click();

        Select usageSelect = new Select(driver.findElement(By.cssSelector("#u_3im_4597")));
        usageSelect.selectByVisibleText("I'm not using XYZ yet, but I will in the future");

        WebElement favoriteFeatureInput = driver.findElement(By.cssSelector("#u_3im_89597"));
        favoriteFeatureInput.sendKeys("djkvfvjfvbbgkfgk");

        MyFunctions.Bekle(3);
        driver.quit();
    }
}

