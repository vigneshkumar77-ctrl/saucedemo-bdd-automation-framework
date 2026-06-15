package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductPage;

public class ProductSteps {
    ProductPage productPage;
     public ProductSteps(){
         productPage = new ProductPage(DriverFactory.getDriver());
     }


    @Then("page title should be {string}")
    public void page_title_should_be(String productText) {

        productPage.verifyingProduct(productText);
    }
    @Then("sort dropdown should display {string}")
    public void sort_dropdown_should_display(String string) {

    }
    @Then("all {int} products should be displayed")
    public void all_products_should_be_displayed(Integer int1) {

    }
    @Then("each product should display a name, description, price, and {string} button")
    public void each_product_should_display_a_name_description_price_and_button(String string) {

    }
    @When("user clicks {string} for {string}")
    public void user_clicks_for(String string, String string2) {

    }
    @Then("the product should be added to the cart")
    public void the_product_should_be_added_to_the_cart() {

    }

    @Then("the copyright information should be displayed")
    public void the_copyright_information_should_be_displayed() {

    }
}
