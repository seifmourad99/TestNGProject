package Login_Test_step1;

import Base.BaseSteps;
import org.testng.Assert;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;
public class logintest extends BaseSteps {

    @org.testng.annotations.Test
    public void testvalidCredential() throws InterruptedException {
        LoginPage loginPage = homePage.clickonloginlink();
        loginPage.insertUsernamee("seif0101");
        loginPage.insertPasswordd("12341234");
        Thread.sleep(3000);
        loginPage.clickloginButton();
        Thread.sleep(3000);
        String actualresult= loginPage.getwelcomeusertext();
        String expectedresult= "Welcome seif0101";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);



    }
}