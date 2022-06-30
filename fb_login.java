package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Khalid\\Driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.facebook.com/");
		wd.findElement(By.id("email")).sendKeys("Mantasha kalim");
		wd.findElement(By.className("pass")).sendKeys("123456");
		// TODO Auto-generated method stub

	}

}
