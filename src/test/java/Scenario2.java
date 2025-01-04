import Base.BaseSteps;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.*;

public class Scenario2 extends BaseSteps {
    @org.testng.annotations.Test
    public void testvalidCredential() throws InterruptedException {
//logintest
        LoginPage loginPage = homePage.clickonloginlink();
        Thread.sleep(2000);
        loginPage.insertUsernamee("seif1223");
        loginPage.insertPasswordd("12341234");
        Thread.sleep(1000);
        loginPage.clickloginButton();
        Thread.sleep(2000);
        String actualresultx = loginPage.getwelcomeusertext();
        String expectedresultx = "Welcome seif1223";
        Assert.assertTrue(actualresultx.contains(expectedresultx));
        System.out.println(actualresultx);

//laptop1
        LaptopsfieldPage laptopsfieldPage=homePage.clickonlaptopsfieldlink();
        Thread.sleep(2000);
        Laptop1page laptop1page= laptopsfieldPage.clickonproduct1page();
        Thread.sleep(2000);
        laptop1page.clickonaddtocartbutton();
        Thread.sleep(2000);
        String actualResult9 = laptop1page.getaddproducttext();
        String expectedResult9 = "Product added";
        Thread.sleep(1000);
        Assert.assertTrue(actualResult9.contains(expectedResult9));
        laptop1page.accept1alert();
        System.out.println(actualResult9);
        laptop1page.clickonhomebtn();
        Thread.sleep(2000);
//laptop2
        homePage.clickonlaptopsfieldlink();
        Thread.sleep(2000);
        Laptop2page laptop2page= laptopsfieldPage.clickonproduct2page();
        Thread.sleep(2000);
        laptop2page.clickonaddtocartbutton();
        Thread.sleep(2000);
        String actualResult8 = laptop2page.getaddproducttext();
        String expectedResult8 = "Product added";
        Thread.sleep(1000);
        Assert.assertTrue(actualResult8.contains(expectedResult8));
        laptop2page.accept2alert();
        System.out.println(actualResult8);
 //validate
        CartPage cartPage = homePage.clickoncartlink();
        Thread.sleep(2000);
        String actualresult7= cartPage.getlaptop1title();
        String expectedresult7 = "Sony vaio i5";
        Thread.sleep(1000);
        Assert.assertTrue(actualresult7.contains(expectedresult7));
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
        Thread.sleep(2000);

        //place order

        PlaceorderPage placeorderPage = cartPage.clickonplaceorderbtn();
        Thread.sleep(2000);
        placeorderPage.insertPurchasenamefield("seif");
        placeorderPage.insertPurchasecountryfield("Egypt");
        placeorderPage.insertPurchasecityfield("Cairo");
        placeorderPage.insertPurchasecreditcardfield("124151242312");
        placeorderPage.insertPurchasemonthfield("11");
        placeorderPage.insertPurchaseyearfield("2022");
        placeorderPage.clickonPurchasebutoon();
        Thread.sleep(2000);




        String actualResult6 = placeorderPage.getsuccessmessagetext();
        String expectedResult6= "Thank you for your purchase!";
        Assert.assertTrue(actualResult6.contains(expectedResult6));
    }
}
