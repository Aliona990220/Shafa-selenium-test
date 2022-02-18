package testCases.searchTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CatalogPage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class ClearSearchField {
    private WebDriver driver;
    private MainPage mainPage;
    private CatalogPage catalogPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://shafa.ua/");
        mainPage = new MainPage(driver);
    }
    @Test
    public void clearSearchField(){
        MainPage newmainPage = mainPage.fillTheSearchBox("сапоги");
        WebElement searchBox = driver.findElements(By.xpath("//input[@name='search_text']")).get(1);
        String  elementval= searchBox.getAttribute("value");
        Assert.assertEquals("сапоги",elementval);
        MainPage newMainPage = mainPage.clearSearchBox();
        String  elementval1 = searchBox.getAttribute("value");
        Assert.assertEquals("",elementval1);


    }
    @Test
    public void searchStringIsEmpty(){
        CatalogPage newMainPage = mainPage.clickingOnTheSearchButton();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        boolean filters = !driver.findElements( By.xpath("//div[@id='filters']")).isEmpty();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void transitionToGoods() {
        mainPage.fillTheSearchBox("Штани");
        mainPage.clickingOnTheSearchButton();
        WebElement searchResult = driver.findElement(By.xpath("//img[@class='b-tile-item__image js-lazy-img lazy-loaded']"));
        String string = searchResult.getAttribute("title");
        searchResult.click();
        WebElement titleProductPage = driver.findElement(By.xpath("//h1[@class='b-product__title']"));
        Assert.assertEquals(string,titleProductPage.getText());


    }
    @Test
    public void switchingBetweenaСategories() throws InterruptedException {
        WebElement categories = mainPage.getAllCategories();
        Assert.assertEquals("Все категории",categories.getText());
        categories.click();
        WebElement categoriesWomen = mainPage.categoryForWomen();
        categoriesWomen.click();
//        Assert.assertEquals("Женщинам", categories.getText());
//        Thread.sleep(5000);

    }

    @After
    public void tearDown(){
        driver.quit();
    }


}

