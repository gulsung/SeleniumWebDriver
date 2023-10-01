package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _12_Select extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.amazon.com.tr/");

        WebElement allCategories = driver.findElement(By.id("searchDropdownBox"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        Select categoryMenu = new Select(allCategories);
        //categoryMenu.selectByVisibleText("Bilgisayarlar");
        //categoryMenu.selectByIndex(3);
        categoryMenu.selectByValue("search-alias=computers");
        searchBox.sendKeys("macbook");

        MyFunctions.Bekle(3);

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        String urlGuncel = driver.getCurrentUrl();

        Assert.assertTrue("macbook sayfasına gidilemedi", urlGuncel.toLowerCase().contains("macbook"));
        //Assert.assertTrue("macbook sayfasına gidilemedi", urlGuncel.contains(searchBox.getText())); bu işlem hata verdi.
        // Sebebi de amazon searchbox içerisinde yazılan yazıyı html kodunda yakalayamıyoruz.

        BekleKapat();

    }
}