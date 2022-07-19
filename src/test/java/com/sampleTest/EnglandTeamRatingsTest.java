package com.sampleTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnglandTeamRatingsTest {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/");
		WebElement ranking = driver.findElement(By.xpath("//div[@class='global-navigation__link' and contains(.,'Rankings ')]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ranking).perform();
		String country="England";
		driver.findElement(By.xpath("//a[@href='/rankings/mens/team-rankings' and @class=' global-navigation__drop-down-link js-global-navigation-drop-down-link' and .='Team Rankings']")).click();
	    List<WebElement> rating = driver.findElements(By.xpath("//table[@class='table']/tbody/tr[*]/td[5]"));
	    for(WebElement ratingss:rating)
		System.out.println(ratingss.getText());
	}

}
