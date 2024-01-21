package Test;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

public class CNCScenario extends BaseTests{

   FindProductPage findProductPage = new FindProductPage() ;
   AddToCartPage addToCartPage= new AddToCartPage();
   IdentifyCustomerPage identifyCustomerPage=new IdentifyCustomerPage();
   CapturePayment_Page capturePayment_page=new CapturePayment_Page();
   FinishTheOrder_page finishTheOrder_page=new FinishTheOrder_page();
   HomePage homePage= new HomePage();

    @Test
    public void CashAndCarryHappyScenario() throws InterruptedException {

// login
        Thread.sleep(2000);
        homePage.clickAdvancedBtn();
        homePage.clickProceedBtn();
        Thread.sleep(2000);
        homePage.enterUserName();
        homePage.clickNextBtn();
        Thread.sleep(1000);
        homePage.enterUserPassword();
        homePage.clickloginBtn();
        homePage.ClickconfirmPopUpLoginMsg();
    // searching for products
        findProductPage.enterProduct("1AAMACWLAMO010CRL001");
        findProductPage.clickOnSearchBtn();
    // userMakeSureThatItemIsAvailableInStore
        addToCartPage.AssertItemAvailableInStore();
    // userAddThatItemToTheCart
        addToCartPage.clickAvailableInStoreBtn();
        addToCartPage.clickAddToCartBtn();
    // user search for the customer
        identifyCustomerPage.searchCustByMobileNum("151007766");
        identifyCustomerPage.clickSearchBtn();
        identifyCustomerPage.assertCustNmeResult("new customer");
    // user select the customer (exist customer)
        Thread.sleep(3000);
       identifyCustomerPage.clickCustRadioCheckBtn();
       identifyCustomerPage.clickSelectCustBtn();
    // identify the customer information
       identifyCustomerPage.selectTaxCustType("Personal");
    // confirm the customer information
        identifyCustomerPage.clickConfirmCustInfoBtn();
        Thread.sleep(3000);
        // user continue to capture the payment
        capturePayment_page.clickContinueToCapturePayment();
    // Select the payment type and pay
        Thread.sleep(3000);
        capturePayment_page.selectCapturePaymentMethod("Cash");
        Thread.sleep(3000);

        capturePayment_page.clickPayBtn();
    // Assert the payment is successful
        capturePayment_page.assertPaymentSuccessful();
        capturePayment_page.clickViewOrderSummaryBtn();
    // Assert that the order status is Carried
        capturePayment_page.assertOrderStatusIsCarried();
    // Finish the order and get the order number
        finishTheOrder_page.getOrderNum();
        finishTheOrder_page.clickDoneOrderBtn();
    }
    }