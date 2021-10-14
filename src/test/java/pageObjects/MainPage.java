package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartButton(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"shopping_cart_link\"]")));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}
