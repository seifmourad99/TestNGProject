package Validatecart_step4_5_6;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

@Test
public class validatecart extends BaseSteps {

    public void checklaptopstittleandprice() throws InterruptedException {
        LoginPage loginPage = homePage.clickonloginlink();
        loginPage.insertUsernamee("seif0101");
        loginPage.insertPasswordd("12341234");
        loginPage.clickloginButton();
        Thread.sleep(3000);


        //laptop1tittle
        CartPage cartPage = homePage.clickoncartlink();
        Thread.sleep(2000);
        String actualresult = cartPage.getlaptop1title();
        String expectedresult = "Sony vaio i5";
        Thread.sleep(1000);
        Assert.assertTrue(actualresult.contains(expectedresult));
        //laptop1price
        String actualresult2 = cartPage.getlaptop1price();
        Integer expectedresult2 = 790;
        Thread.sleep(1000);
        Assert.assertTrue(actualresult2.contains(expectedresult2.toString()));
        //laptop2tittle
        String actualresult3 = cartPage.getlaptop2tittle();
        String expectedresult3 = "Sony vaio i7";
        Thread.sleep(1000);
        Assert.assertTrue(actualresult3.contains(expectedresult3));
        //laptop2price
        String actualresult4 = cartPage.getlaptop2price();
        Integer expectedresult4 = 790;
        Thread.sleep(1000);
        Assert.assertTrue(actualresult4.contains(expectedresult4.toString()));

        //verify total amount calculation
        String actualresult5 = cartPage.gettottalprice();
        Integer expectedresult5 = expectedresult4+expectedresult2;
        Thread.sleep(1000);
        Assert.assertTrue(actualresult5.contains(expectedresult5.toString()));
        Thread.sleep(1000);

        //place order
       Thread.sleep(2000);
        PlaceorderPage placeorderPage = cartPage.clickonplaceorderbtn();
        Thread.sleep(2000);
        placeorderPage.insertPurchasenamefield("seif");
        placeorderPage.insertPurchasecountryfield("Egypt");
        placeorderPage.insertPurchasecityfield("Cairo");
        placeorderPage.insertPurchasecreditcardfield("124151242312");
        placeorderPage.insertPurchasemonthfield("11");
        placeorderPage.insertPurchaseyearfield("2022");
        Thread.sleep(2000);
        placeorderPage.clickonPurchasebutoon();
        Thread.sleep(2000);
        String actualResult6 = placeorderPage.getsuccessmessagetext();
        String expectedResult6= "Thank you for your purchase!";
        Assert.assertTrue(actualResult6.contains(expectedResult6));










    }
}





