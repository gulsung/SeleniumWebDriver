package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    static {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);

    }
    public static void BekleKapat(){
        MyFunctions.Bekle(3);
        driver.quit();
    }
}
