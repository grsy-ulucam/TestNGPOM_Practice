package proje.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proje.utilities.Driver;

import java.util.List;

public class SauceDemoLoginPage {
    public SauceDemoLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user-name")
    public WebElement txtUsername;

    @FindBy(id = "password")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement btnLogin;

    @FindAll(
            {
                    @FindBy(id = "user-name"),
                    @FindBy(id = "password"),
                    @FindBy(xpath = "//*[@id='login-button']")

            }
    )
    public List<WebElement> inputElements;

}
