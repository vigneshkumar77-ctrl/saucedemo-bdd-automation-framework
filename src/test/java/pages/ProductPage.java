package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private By productText  = By.id("Products");

    private WebDriver driver;

    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void verifyingProduct(String productText) {
        String pt = driver.findElement(By.xpath("//span[text()='Products']")).getText();
        System.out.println(pt);
    }

}

