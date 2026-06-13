package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By productsTitle = By.className("title");
    private By loginError = By.tagName("h3");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(3000);
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(productsTitle).isDisplayed();
    }

    public void loginErrorMessageValidation(){

        String errorMsg= driver.findElement(loginError).getText();
        Assert.assertEquals(errorMsg,"Epic sadface: Username and password do not match any user in this service");
    }
}
