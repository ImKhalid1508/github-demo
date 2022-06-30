package com.mindtree.seleniumclass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gopal_assign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Khalid\\Driver\\chromedriver.exe");
		WebDriver mannu=new ChromeDriver();
		mannu.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_"
				+ "to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid"
				+ ".identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc"
				+ "_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.n"
				+ "et%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.ne"
				+ "t%2Fauth%2F2.0&");
		mannu.manage().window().maximize();
		mannu.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		mannu.findElement(By.name("email")).sendKeys("6207723255");
		mannu.findElement(By.id("continue")).click();
		mannu.findElement(By.name("password")).sendKeys("Khalid@123");
		mannu.findElement(By.xpath("//*[@id=\'signInSubmit']")).click();    
		
		//*[@id="signInSubmit"]
		
		mannu.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("refrigerator");
		mannu.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();
		//mannu.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("samsung 192L refrigerator");
		//mannu.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();
		//System.out.println(mannu.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[26]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getSize());
		//System.out.println(mannu.findElement(By.xpath("//img[@class='s-image']")).getAttribute("alt"));
		mannu.findElement(By.xpath("//img[contains(@alt,'Samsung 192 L 2 Star Direct Cool ')]")).click();
		WebElement we=mannu.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
		String price1=we.getText();
		System.out.println(price1);
		
		
		//mannu.findElement(By.xpath("//img[@alt='Samsung 192 L 2 Star Direct Cool Single Door Refrigerator (RR19A241BGS/NL, Grey Silver)']")).click();
		
		Set<String>  ids=mannu.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String Pid=it.next();
		String Cid=it.next();
		mannu.switchTo().window(Cid);
		
		WebElement sb=mannu.findElement(By.xpath("//div[@id='apex_desktop'] //span[@class='a-price-whole']"));
		String price2=sb.getText();
		System.out.println(price2);
		if(price1.equals(price2)) {
			System.out.println("Price matched");
		}
		else
		{
			System.out.println("Price doesn't matched");
		}
		
		
		
		

	
	}

}
