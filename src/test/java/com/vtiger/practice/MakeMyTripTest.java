package com.vtiger.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripTest {

	public static void main(String[] args) throws InterruptedException {
	
        String FromCity="Bengaluru, India";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(FromCity);
		driver.findElement(By.xpath("//div[@class='calc60']//p[.='"+FromCity+"']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
