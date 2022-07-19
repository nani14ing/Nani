package com.sampleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeTest {

	public static void main(String[] args) throws InterruptedException {
		
		String songName="jagave neenu galatiye";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(songName);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//img[@src=\"https://i.ytimg.com/vi/xL7FJkIKF-4/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDzXRW17LBlPHJDKx1PhVkQFF6yEQ\"]")).click();
		Thread.sleep(50000);
		driver.quit();

	}

}
