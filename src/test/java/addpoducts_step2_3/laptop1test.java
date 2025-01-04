package addpoducts_step2_3;

import Base.BaseSteps;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Laptop1page;
import pages.LaptopsfieldPage;
@Test
public  class laptop1test extends BaseSteps {

    public void addlaptop1tocart() throws InterruptedException {
    LaptopsfieldPage laptopsfieldPage=homePage.clickonlaptopsfieldlink();
    Thread.sleep(3000);
    Laptop1page laptop1page= laptopsfieldPage.clickonproduct1page();
    Thread.sleep(3000);
    laptop1page.clickonaddtocartbutton();
    Thread.sleep(3000);
    String actualResult = laptop1page.getaddproducttext();
    String expectedResult = "Product added";
    Thread.sleep(2000);
    Assert.assertTrue(actualResult.contains(expectedResult));
    laptop1page.accept1alert();
    System.out.println(actualResult);}


    }


