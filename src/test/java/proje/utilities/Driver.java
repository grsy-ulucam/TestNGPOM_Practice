package proje.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    private Driver(){

    }
    public static WebDriver getDriver(){

        if(driver == null){

            WebDriverManager.firefoxdriver().setup();

            driver =new FirefoxDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        return driver;

    }

    public static void closeDriver(){

        if(driver != null){

            driver.quit();

            driver = null;

        }
    }







}
