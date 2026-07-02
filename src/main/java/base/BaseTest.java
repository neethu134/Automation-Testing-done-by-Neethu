package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.Driverfactory;


public class BaseTest {
	
	protected WebDriver driver;

@BeforeMethod
    public void setup() {
    	
	String browser = ConfigReader.get("browser");

    driver = Driverfactory.initDriver(browser);

    driver.get(ConfigReader.get("url"));
}

@AfterMethod
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
}

	


