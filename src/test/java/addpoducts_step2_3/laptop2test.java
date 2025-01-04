package addpoducts_step2_3;
import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Laptop2page;
import pages.LaptopsfieldPage;
@Test
public  class laptop2test extends BaseSteps {

    public void addlaptop2tocart() throws InterruptedException {
        LaptopsfieldPage laptopsfieldPage=homePage.clickonlaptopsfieldlink();
        Thread.sleep(3000);
        Laptop2page laptop2page= laptopsfieldPage.clickonproduct2page();
        Thread.sleep(3000);
        laptop2page.clickonaddtocartbutton();
        Thread.sleep(3000);
        String actualResult = laptop2page.getaddproducttext();
        String expectedResult = "Product added";
        Thread.sleep(2000);
        Assert.assertTrue(actualResult.contains(expectedResult));
        laptop2page.accept2alert();
        System.out.println(actualResult);}


}
