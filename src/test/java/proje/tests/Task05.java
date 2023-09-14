package proje.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import proje.pages.AmazonHomePage;

import java.time.Duration;

public class Task05 {

    @Test
    public void test() {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com.tr/");

        AmazonHomePage homePage = new AmazonHomePage(driver);

       // homePage.searchFor("pen");

        homePage.navigateToOrders();

        driver.close();
    }
    }
