package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private By productText  = By.id("Products");

    private WebDriver driver;

    public ProductPage(WebDriver Driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyingProduct(String productText) {
        String pt = driver.findElement(By.id("Products")).getText();
        System.out.println(pt);
    }

}

