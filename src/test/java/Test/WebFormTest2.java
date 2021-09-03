package Test;

import PageFactory.Utils;
import PageFactory.WebFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebFormTest2 extends BaseTest{

    @Test(testName = "Submit a WebForm2")
    public static void submitForm2() throws InterruptedException {
        System.out.println("Running submit form 2");
        WebFormPage webForm = new WebFormPage(driver);
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        Thread.sleep(1000);

    }

}
