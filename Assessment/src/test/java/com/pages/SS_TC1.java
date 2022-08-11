package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SS_TC1 {

	WebDriver driver;
	//Home Page

	By January= By.partialLinkText("January");
	By February= By.partialLinkText("February");
	By Home= By.id("home_link_div");
	public SS_TC1(WebDriver driver)
	{
		this.driver=driver;
	}


	public WebElement January(WebDriver driver){return driver.findElement(January);}
	public WebElement Feb(WebDriver driver){return driver.findElement(February);}
	public WebElement Home(WebDriver driver){return driver.findElement(Home);}



}

