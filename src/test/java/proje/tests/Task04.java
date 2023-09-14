package proje.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import proje.pages.HtmlGoodiesHomePage;
import proje.pages.SauceDemoLoginPage;
import proje.utilities.Driver;

public class Task04 {

@Test
    public void test01(){

    Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

    HtmlGoodiesHomePage hg=new HtmlGoodiesHomePage();

    Actions actions =new Actions(Driver.getDriver());

    actions
            .dragAndDrop(hg.copenhag, hg.denmark)
            .dragAndDrop(hg.seoul, hg.sKorea)
            .dragAndDrop(hg.washington,hg.us)
            .dragAndDrop(hg.rome, hg.italy)
            .dragAndDrop(hg.madrid, hg.spain)
            .dragAndDrop(hg.oslo,hg.norway)
            .dragAndDrop(hg.stockholm,hg.sweden)
            .perform();

    Driver.closeDriver();

}
    @Test
    public void test02() {

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage hg = new SauceDemoLoginPage();

        System.out.println(hg.inputElements.size());

        Assert.assertEquals(3,hg.inputElements.size());

        Driver.closeDriver();

    }
}
