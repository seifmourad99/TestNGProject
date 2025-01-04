package Signup_test;

import Base.BaseSteps;
import org.openqa.selenium.*;
import org.testng.Assert;
import pages.SignupPage;

import static org.testng.Assert.assertTrue;
public class Scenario1Test extends BaseSteps {

    @org.testng.annotations.Test
    public void testvalidCredential() throws InterruptedException {
        SignupPage signupPage = homePage.clickonsignuplink();
        signupPage.insertUsername("seif12257");
        signupPage.insertPassword("12341234");
        Thread.sleep(4000);
        signupPage.clickSignupButton();
        Thread.sleep(3000);
      Alert alert = driver.switchTo().alert();
        String actualResult = signupPage.getsinupalertmessagetext();
        String expectedResult = "Sign up successful";
        Assert.assertTrue(actualResult.contains(expectedResult));
        signupPage.acceptalert();
    }
}