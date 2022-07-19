package com.vtiger.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccWomenRankings {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/");
		WebElement ranking = driver.findElement(By.xpath("//div[@class='global-navigation__link' and contains(.,'Rankings ')]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ranking).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/rankings/womens/team-rankings']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
