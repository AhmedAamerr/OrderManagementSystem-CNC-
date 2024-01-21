package pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FinishTheOrder_page extends BaseTests {

    public WebElement orderNum(){
        return driver.findElement(By.xpath("//body/div[@id='applicationHolder']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    }

    public void getOrderNum(){
        System.out.println("Order Number: "+ orderNum().getText().substring(2));
    }
    public WebElement doneOrderBtn(){
        return driver.findElement(By.xpath("//body/div[@id='applicationHolder']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/button[1]"));
    }

    public void clickDoneOrderBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(doneOrderBtn()));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", doneOrderBtn());
    }


}
