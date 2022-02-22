package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement newPage() {
        WebElement newPages = driver.findElement(By.xpath("//div[@class='_1XIo1mbj_75DOTiXovdM NWoSNylPq2jU8QmRiIcl']"));
        return newPages;
    }
        public WebElement likeProductPage () {
            WebElement likeProductPages = driver.findElement(By.xpath("//span[@class='b-product-buttons__icon-holder']"));
            return newPage();
        }
        public WebElement closePopuButton() {
            WebElement closePopupButton = driver.findElement(By.xpath("//svg[@class='_3uENNXw0uoUlxLW6Jnr3']"));
            return closePopupButton;
        }



}




