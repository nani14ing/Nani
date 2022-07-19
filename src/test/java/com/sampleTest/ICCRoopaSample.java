package com.sampleTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCRoopaSample {

	public static void main(String[] args) {
	
		String country="England";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/");
		WebElement rank = driver.findElement(By.xpath("//div[@class='global-navigation__link' and contains(text(),'Rank')]"));		
		Actions act=new Actions(driver);
		act.moveToElement(rank).perform();
		driver.findElement(By.xpath("//a[@href='/rankings/mens/team-rankings']")).click();
       // String date = driver.findElement(By.xpath("//table[@class='table']/tbody//tr[contains(.,'"+country+"')]/td[4]")).getText();
       List<WebElement> teams = driver.findElements(By.xpath("//table[@class='table']/tbody/descendant::tr[*]/td[2]"));
        //List<WebElement> team = driver.findElements(By.xpath("//table[@class='table']"));
        for(WebElement t:teams) {
        System.out.println(	t.getText());
	}
	}
}
