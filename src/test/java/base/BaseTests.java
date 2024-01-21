package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;


import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class BaseTests {
   public static WebDriver driver;


    @BeforeClass
    public void SetUp() throws FileNotFoundException, InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://omssit-oms.apps.btarostg.westeurope.aroapp.io/wsc/ngstore/home.do");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
