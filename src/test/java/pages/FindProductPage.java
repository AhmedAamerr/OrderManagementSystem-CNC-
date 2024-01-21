package pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



// for cash and carry ***************************************************
 public class FindProductPage extends BaseTests
{
    public WebElement searchProductField(){
        return driver.findElement(By.xpath("//*[@title='Scan product or enter keywords']"));
    }

    public void enterProduct(String item){
        searchProductField().sendKeys(item);
    }

    public WebElement searchProductBtn(){
        return driver.findElement(By.xpath("//div[@class='input-group input-icon']//*[@class='btn btn-icon scanner-btn']"));
    }

    public void clickOnSearchBtn(){
        searchProductBtn().click();
    }

//    For Assertion
//    public WebElement productID(String item){
//        WebElement productID = driver.findElement(By.xpath("//span[contains(text(),item)]"));
//        return productID;
//    }


}
