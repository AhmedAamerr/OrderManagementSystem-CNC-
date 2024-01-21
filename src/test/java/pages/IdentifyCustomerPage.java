package pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class IdentifyCustomerPage extends BaseTests {
    public WebElement custMobileNumField(){
        return driver.findElement(By.xpath("//input[@id='customer_mobileNumber']"));
    }

    public void searchCustByMobileNum(String num){
        custMobileNumField().sendKeys(num);
    }

    public WebElement searchBtn(){
        return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/footer[1]/div[1]/div[2]/button[1]"));
    }

    public void clickSearchBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn()));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", searchBtn());
    }

    public WebElement custNameSearchResult(){
        return driver.findElement(By.xpath("//*[@class='custom-name']"));
    }

    public void assertCustNmeResult(String custName){
       // int enteredCustNum=Integer.parseInt(num);
        String custNameSearchResult=custNameSearchResult().getText();
        Assert.assertEquals(custName,custNameSearchResult);
    }

    public WebElement chooseCustRadioCheck(){
        return driver.findElement(By.xpath("//*[@class='repeating-panel in-modal one-column custom-repeat']//*[@class='select-icon']"));
    }

    public void clickCustRadioCheckBtn(){
        chooseCustRadioCheck().click();
    }


    public WebElement selectCustBtn(){
        return driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
    }

    public void clickSelectCustBtn(){
        // selectCustBtn().click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectCustBtn()));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", selectCustBtn());

    }

    public WebElement selectTaxCustTypeMenu(){
        return driver.findElement(By.xpath("//select[@id='EGTaxCustType_address_capture']"));
    }

    public void selectTaxCustType(String type){
        Select select =new Select(selectTaxCustTypeMenu());
        select.selectByVisibleText(type);
    }

    public WebElement confirmCustInfo(){
        return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/footer[1]/div[1]/div[2]/button[1]"));
    }

    public void clickConfirmCustInfoBtn(){
        confirmCustInfo().click();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(confirmCustInfo()));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", confirmCustInfo());
    }
}
