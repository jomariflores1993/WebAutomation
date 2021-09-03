package Test;

import PageFactory.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        System.out.println("Before Class");
    }
    @AfterClass
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
        System.out.println("After Class");
    }
}
