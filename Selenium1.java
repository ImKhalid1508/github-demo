package com.mindtree.seleniumclass;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// This is used to set the web driver & path)
		System.setProperty("webdriver.chrome.driver", "E:\\Khalid\\Driver\\chromedriver.exe");
		
		//used to create object of driver to access.
		WebDriver driver=new ChromeDriver();
		
		//used to get the url link 
		driver.get("https://www.google.com/");
		
		//used to display title of web page
		System.out.println(driver.getTitle());
		
		//used to maximize the window
		driver.manage().window().maximize();
		
		//to find the path of element
		driver.findElement(By.name("q")).sendKeys("amazon");
		
		//to check whether landed on current url
		System.out.println(driver.getCurrentUrl());
		
		//to get the web page source
		System.out.println(driver.getPageSource());
		
		
		//navigate to different window.
		driver.navigate().to("https://yahoo.com");
	
		//driver.close();   //close current browser
		driver.quit();     //close all the browser
		
	}

}
