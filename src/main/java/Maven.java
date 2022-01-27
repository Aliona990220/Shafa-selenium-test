import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Maven {
        private WebDriver driver;


        public Maven(WebDriver driver) {
            this.driver = driver;
        }
        @FindBy(xpath = "//input[@class='Fijv8ChRIU30cAzthBF7 y20NIjzYVt3UZsmA05HL KMzz1s8R34fYmLLg0x9t']")
        private WebElement searchBox ;

        @FindBy(xpath = "//button[@class='2Td-4z1WVoTWSie5zwdW']")
        private WebElement magnifyingGlass ;

    public Maven clickingOnTheSearchBox(String search){
        searchBox.click();
        searchBox.sendKeys(search);
        magnifyingGlass.click();
        return this;
    }
    public Maven clickingOnmagnifyingGlass(){
        magnifyingGlass.click();
        return this;
    }
    public Maven clearSearchBox(){
        searchBox.sendKeys();
        magnifyingGlass.click();
        searchBox.clear();
        return this;
    }


    }


