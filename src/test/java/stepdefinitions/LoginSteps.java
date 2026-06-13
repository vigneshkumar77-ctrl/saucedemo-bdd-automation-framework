package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
        loginPage = new LoginPage(DriverFactory.getDriver());
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        loginPage.clickLogin();
    }

    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {
        Assert.assertTrue(loginPage.isHomePageDisplayed(),"the product title is available in homepage");
    }

    @Then("user should be informed with an error message")
    public void userShouldBeInformedWithAnErrorMessage() {
        loginPage.loginErrorMessageValidation();

    }
}