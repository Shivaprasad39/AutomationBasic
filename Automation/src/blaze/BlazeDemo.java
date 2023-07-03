package blaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://blazedemo.com/");
		String Firstpgt = driver.getTitle();	
		if (Firstpgt.contains("BlazeDemo")) {
			System.out.println("BlazeDemo title validation is pass");
		}
		else
		{
			System.out.println("BlazeDemo title validation is Fail");
			driver.quit();
		}
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		String Secondpgt = driver.getTitle();   
		if (Secondpgt.contains("reserve")) {
			System.out.println("Reserve title validation is pass");
		}
		else
		{
			System.out.println("Reserve title validation is Fail");
			driver.quit();
		}
		driver.findElement(By.xpath("//td[.='United Airlines']/..//input[@value='Choose This Flight']")).click();
		String Thirdpgt = driver.getTitle();     
		if (Thirdpgt.contains("Purchase")) {
			System.out.println("Purchase title validation is pass");
		}
		else
		{
			System.out.println("Purchase title validation is Fail");
			driver.quit();
		}
		driver.findElement(By.xpath("//input[@placeholder='First Last']")).sendKeys("Nithya Kalyani");
		driver.findElement(By.xpath("//input[@placeholder='123 Main St.']")).sendKeys("#121 ABC Street");
		driver.findElement(By.xpath("//input[@placeholder='Anytown']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("//input[@placeholder='Credit Card Number']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@placeholder='John Smith']")).sendKeys("NITHYA KALAYANI");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();		
		String Amount = driver.findElement(By.xpath("//td[.='Amount']/../td[2]")).getText();
		System.out.println("Amount ="+" "+ Amount );
		String CardNumber = driver.findElement(By.xpath("//td[.='Card Number']/../td[2]")).getText();
		System.out.println("Card Number ="+" "+ CardNumber );
		String Expiration = driver.findElement(By.xpath("//td[.='Expiration']/../td[2]")).getText();
		System.out.println("Expiration ="+" "+ Expiration );
		driver.quit();
		System.out.println("Demotest");
       
		System.out.println("Testing git");

	}

}
