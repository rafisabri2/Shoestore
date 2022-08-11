package com.testcases;

import com.Library.ReusableFunctions;
import com.pages.Baseclass;
import com.pages.SS_TC1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SS_TC1_Test extends Baseclass {

    public SS_TC1 Homeobj = new SS_TC1(driver);
    public ReusableFunctions reuse = new ReusableFunctions();


    @Test(priority = 1)
    public void Monthwise_Search() throws InterruptedException {
         reuse.waitfor(driver,20000);
         Homeobj.January(driver).click();
        reuse.wait(5000);
        List<WebElement> elements1 = driver.findElements(By.className("shoe_result_row"));
//        List<WebElement> elements2 = driver.findElements(By.className("shoe_result_value shoe_name"));
        System.out.println("Number of elements:" +elements1.size());

        for (int i=0; i<elements1.size();i++){
            System.out.println("Brand Name is:" + elements1.get(i).getText());
            String ActualBrandName =  elements1.get(i).getText();
            String ExpectedName = "Jimmy Choo Kera Platform Sandal";
            Assert.assertEquals(ActualBrandName, ExpectedName);
        }

        Homeobj.Home(driver).click();
        reuse.wait(3000);
        Homeobj.Feb(driver).click();
        reuse.wait(5000);
        driver.quit();
    }


}