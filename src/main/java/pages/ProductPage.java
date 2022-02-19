package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement likeProductPage() {
        WebElement likeProductPages = driver.findElement(By.xpath("//svg[@class='b-product-buttons__icon']"));
        return likeProductPages;
    }
}




