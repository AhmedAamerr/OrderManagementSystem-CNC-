package pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddToCartPage extends BaseTests

{
    public WebElement availabilityInStore(){
        return driver.findElement(By.xpath("//span[contains(text(),'Cash And Carry')]"));
    }

    public  int getAvailableQty(){
            WebElement availableQty=driver.findElement(By.xpath("//span[contains(text(),'Sellable:')]"));
        String avQty= availableQty.getText().substring(29).toString();
        return Integer.parseInt(avQty);
    }

    public int getSelectedQty(){
        WebElement selectedQty = driver.findElement(By.xpath("//body/div[@id='applicationHolder']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]"));
        return  Integer.parseInt(selectedQty.getText());
    }

    public void AssertItemAvailableInStore(){
        Assert.assertTrue(availabilityInStore().isDisplayed());
        Assert.assertTrue(getAvailableQty()>=getSelectedQty());
    }

    public WebElement availableInStoreBtn(){
        return driver.findElement(By.xpath("//body/div[@id='applicationHolder']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/button[1]"));
    }

    public void clickAvailableInStoreBtn(){
        availableInStoreBtn().click();
    }

    public WebElement addToCartBtn(){
        return driver.findElement(By.xpath("//body/div[@id='applicationHolder']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
    }

    public void clickAddToCartBtn(){
        addToCartBtn().click();
    }

    public void selectQty(int qty) {
        while (qty >= 1 && qty <= getAvailableQty()) {

        }
    }
}
