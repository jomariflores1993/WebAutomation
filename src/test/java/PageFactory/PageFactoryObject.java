package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryObject {
    protected WebDriver driver;

    public PageFactoryObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}





