package PageFactory;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebFormPage extends PageFactoryObject {

    Faker faker = new Faker();

    private final String FIRST_NAME = faker.name().firstName();
    private final String LAST_NAME = faker.name().lastName();

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
}
