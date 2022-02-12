package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSearchBox() {
        WebElement searchBox = driver.findElements(By.xpath("//input[@name='search_text']")).get(1);
        String  elementval= searchBox.getAttribute("value");
        return searchBox;
    }
    public WebElement getButtonSearch() {
        WebElement buttonSearch = driver.findElements(By.xpath("//button[@class='_2Td-4z1WVoTWSie5zwdW']")).get(1);
        return buttonSearch;
    }
    public WebElement getAllCategories() {
        WebElement allCategories = driver.findElements(By.xpath("//div[@class=' css-1uccc91-singleValue']")).get(1);
        return allCategories;
    }


    public MainPage fillTheSearchBox(String search){
        getSearchBox().click();
        getSearchBox().sendKeys(search);
        return this;
    }

    public CatalogPage clickingOnTheSearchButton(){
        getButtonSearch().click();
        return new CatalogPage(driver);
    }

    public MainPage clearSearchBox(){
        getSearchBox().clear();
        return this;
    }
    public MainPage clickOnAllCategories(){
        getAllCategories().click();
        return this;
    }






}
