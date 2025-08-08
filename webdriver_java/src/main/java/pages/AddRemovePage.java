package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage {

    private WebDriver driver;
    private By addElementButton = By.xpath("//*[@id=\"content\"]/div/button");
    private By deleteElementButton = By.xpath("//button[normalize-space()='Delete']");

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElementButton() {
        driver.findElement(addElementButton).click();
    }

    public void clickDeleteElementButton() {
        driver.findElement(deleteElementButton).click();
    }

    public boolean isElementPresent() {
        return !driver.findElements(deleteElementButton).isEmpty();
    }

}
