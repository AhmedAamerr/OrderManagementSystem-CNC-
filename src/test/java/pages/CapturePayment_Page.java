package pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class CapturePayment_Page extends BaseTests {

    public WebElement continueToCapturePayment() {
        return driver.findElement(By.xpath("//*[@class='btn btn-primary extn-continue-button']"));
    }

    public void clickContinueToCapturePayment(){
        //continueToCapturePayment().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continueToCapturePayment()));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", continueToCapturePayment());
    }

    public WebElement capturePaymentMethodMenu(){
        return driver.findElement(By.xpath("//select[@id='pc_paymentType_order_pc_new_0']"));
    }

    public void selectCapturePaymentMethod(String payMethod){
//        capturePaymentMethodMenu().click();
//
        driver.findElement(By.xpath("//*[@id='pc_paymentType_order_pc_new_0']//option[contains(text(),'Cash')]")).click();

//        Select dropdown = new Select(capturePaymentMethodMenu());
//        dropdown.selectByVisibleText(payMethod);

        Select select = new Select(capturePaymentMethodMenu());
        select.selectByVisibleText(payMethod);


//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(capturePaymentMethodMenu()).click().perform();
//        WebElement optionToClick = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='pc_paymentType_order_pc_new_0']//option[contains(text(),'Cash')]"))));
//        actions.moveToElement(optionToClick).click().perform();
    }

    public WebElement payBtn(){
        return driver.findElement(By.xpath("//*[@class='btn btn-primary extn-pay-confirm-button']"));
    }
    public void clickPayBtn(){
        payBtn().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(payBtn()));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", payBtn());
    }

    public WebElement paymentSuccessMsg(){
        return driver.findElement(By.xpath("//div[@class='modal-content']//span[contains(text(),'Payment Successful')]"));
    }
    public void assertPaymentSuccessful(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(paymentSuccessMsg()));
        Assert.assertTrue(paymentSuccessMsg().isDisplayed());
    }

    public WebElement viewOrderSummaryBtn(){
        return driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/footer[1]/div[1]/button[1]"));
    }
    public void clickViewOrderSummaryBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(viewOrderSummaryBtn()));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", viewOrderSummaryBtn());
    }

    public WebElement orderStatusCarriedDisplayed(){
        return driver.findElement(By.xpath("//body/div[@id='applicationHolder']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]"));
    }

    public void assertOrderStatusIsCarried(){
        Assert.assertTrue(orderStatusCarriedDisplayed().getText().contains("Carried"));
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
