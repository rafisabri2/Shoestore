package com.pages;


import com.Library.ReusableFunctions;
import com.utility.BrowserFactory;
import com.utility.ConfigDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class Baseclass {

    public WebDriver driver;
    public ConfigDataProvider config;

    @BeforeSuite
    public void setupsuite() throws IOException {
        config=new ConfigDataProvider();
    }

    @BeforeClass
    public void Setup()
    {

            driver= BrowserFactory.startbrowser(driver,config.Getbrowser(),config.Geturl());
            ReusableFunctions.checkPageIsReady(driver);

    }

      @AfterClass
    public void Teardown()
    {
        driver.quit();
    }


}
