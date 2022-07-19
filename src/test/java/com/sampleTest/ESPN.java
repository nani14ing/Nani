package com.sampleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ESPN {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		WebElement seriesdrp = driver.findElement(By.xpath("//a[text()='Series']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(seriesdrp).perform();
		driver.findElement(By.xpath("//ul[@class=\"ds-flex ds-flex-col ds-text-typo-paragraph ds-justify-center ds-overflow-ellipsis ds-w-full ds-grid ds-grid-cols-2 ds-items-center\"]//span[.='West Indies v Bangladesh']")).click();
		driver.findElement(By.xpath("//span[.='Results']")).click();
		driver.findElement(By.xpath("//div[text()='2nd Test, Gros Islet, June 24 - 27, 2022']")).click();
		WebElement matches = driver.findElement(By.xpath("//span[text()='Bangladesh 1st INNINGS']/ancestor::div[@class='ds-bg-fill-content-prime ds-rounded-lg']/descendant::table/tbody/tr[contains(.,'Mahmudul Hasan Joy')]/td[4]"));
		String num = matches.getText();
		System.out.println(num);
		

	}

}
