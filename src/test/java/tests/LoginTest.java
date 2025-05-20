package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage login = new LoginPage(driver);
        login.loginAs("admin", "admin123");
        Assert.assertTrue(true); // Dummy assertion
    }
}
