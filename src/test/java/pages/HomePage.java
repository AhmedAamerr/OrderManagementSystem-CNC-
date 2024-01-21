package pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTests {




    public WebElement AdvancedBtn()
    {
        return driver.findElement(By.id("details-button"));
    }

    public void clickAdvancedBtn()
    {

        AdvancedBtn().click();

    }

    public WebElement proceedBtn()
    {
        return driver.findElement(By.id("proceed-link"));
    }


    public void clickProceedBtn()
    {

        proceedBtn().click();

    }

    public WebElement UsernameField()
    {
        return driver.findElement(By.name("loginfmt"));
    }


    public void  enterUserName()
    {
        UsernameField().sendKeys("abdelrahman.khashaba@btech.com");
    }


    public WebElement nextBtn()
    {

        return driver.findElement(By.id("idSIButton9"));
    }

    public void clickNextBtn()
    {
        nextBtn().click();

    }

    public WebElement PasswordField()
    {
        return driver.findElement(By.name("passwd"));
    }


    public void  enterUserPassword()
    {
        PasswordField().sendKeys("QWERqwer1234");

    }


    public WebElement loginBtn()
    {

        return driver.findElement(By.id("idSIButton9"));
    }

    public void clickloginBtn()
    {
        loginBtn().click();

    }


    public WebElement ConfirmPopUpLoginMsg()
    {
        return driver.findElement(By.id("idBtn_Back"));

    }


    public void ClickconfirmPopUpLoginMsg()
    {
        ConfirmPopUpLoginMsg().click();

    }



    public WebElement OrderCreationScreen()
    {
        return driver.findElement(By.xpath("//*[@id=\"navigate_away_btn_grp\"]/span[1]"));

    }


    public void ClickOrderCreationScreenBtn()
    {
        OrderCreationScreen().click();

    }


    public WebElement CustomerServiceView()
    {
        return driver.findElement(By.id("Customer_Service"));

    }


    public void  ClickOnCustomerServiceViewBtn()
    {
        CustomerServiceView().click();



    }





}
