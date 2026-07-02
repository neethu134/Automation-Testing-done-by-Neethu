package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        LoginPage login = new LoginPage(driver);

        login.login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
            
        );
    }
}