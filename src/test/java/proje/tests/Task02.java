package proje.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import proje.utilities.Driver;

import java.util.List;
import java.util.stream.Collectors;

public class Task02 {

    @Test
    public  void  test(){

        Driver.getDriver().get("https://www.saucedemo.com/");
        WebElement email=Driver.getDriver().findElement(By.xpath("//*[@id='user-name']"));
        email.sendKeys("standard_user");
        WebElement pwd=Driver.getDriver().findElement(By.xpath("//*[@id='password']"));
        pwd.sendKeys("secret_sauce");
        WebElement loginButton=Driver.getDriver().findElement(By.id("login-button"));
        loginButton.click();

        WebElement boxButton=Driver.getDriver().findElement(By.tagName("select"));
        Select select=new Select(boxButton);
        select.selectByValue("lohi");

        List<WebElement>itemPrices=Driver.getDriver().findElements(By.className("inventory_item_price"));
        List<Double>urunFiyatlari=itemPrices.stream().
                map(x->x.getText().substring(1)).
                map(x->Double.parseDouble(x)).
                collect(Collectors.toList());

        for (int i = 0; i < urunFiyatlari.size()-1 ; i++) {

            Assert.assertTrue(urunFiyatlari.get(i)<=urunFiyatlari.get(i+1));
        }

        System.out.println(urunFiyatlari);

        Driver.closeDriver();

    }
}
