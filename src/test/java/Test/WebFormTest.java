package Test;
import PageFactory.WebFormPage;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class WebFormTest extends BaseTest {


    @Test(testName = "Submit a WebForm")
    public static void submitForm() throws InterruptedException{
        WebFormPage webForm = new WebFormPage(driver);
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        Thread.sleep(1000);
    }
}
