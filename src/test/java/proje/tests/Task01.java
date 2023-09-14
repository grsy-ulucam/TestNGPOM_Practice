package proje.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import proje.utilities.ConfigReader;
import proje.utilities.Driver;

public class Task01 {

    @Test
    public void test01(){

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        String titleText=Driver.getDriver().getTitle();
        Assert.assertTrue(titleText.contains("OrangeHRM"));
        Driver.closeDriver();

    }
    @Test
    public void test02(){

        WebDriver driver=Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String titleText=Driver.getDriver().getTitle();
        Assert.assertTrue(titleText.contains("OrangeHRM"));
        Driver.closeDriver();

    }
    @Test
    public  void  readConfig(){

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.closeDriver();


    }
}
