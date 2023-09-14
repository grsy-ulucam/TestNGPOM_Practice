package proje.tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import proje.pages.SauceDemoHomePage;
import proje.pages.SauceDemoLoginPage;
import proje.utilities.Driver;

public class Task03 {

    @Test
    public void test(){

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage loginPage=new SauceDemoLoginPage();
        loginPage.txtUsername.sendKeys("standard_user");
        loginPage.txtPassword.sendKeys("secret_sauce");
        loginPage.btnLogin.click();

        SauceDemoHomePage homePage=new SauceDemoHomePage();
        Select select=new Select(homePage.filterDropdown);
        select.selectByValue("lohi");
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("low to high"));

        Driver.closeDriver();

    }
}
