package com.ScenariosTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripTest {

	@Test
	public void makeMyTripTest() throws InterruptedException
	{
		
		String from="Banglore";
		String to="Pune";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(from);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		
		driver.findElement(By.xpath("//span[.='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(to);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/descendant::div[@aria-label='Wed Jul 13 2022']")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
		driver.quit();		
	}
	
//	@DataProvider
//	public Object[][] getmultplecities() throws IOException
//	{
//		FileInputStream fis=new FileInputStream("./src/test/resources/makemytrip.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		 Sheet sh = wb.getSheet("Sheet1");
//		 Object[][] arr=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
//		 System.out.println(arr.length);
//		 for(int i=1; i<=sh.getLastRowNum(); i++)
//		 {
//			 for(int j=0; j<sh.getRow(i).getLastCellNum();j++)
//			 {
//				 arr[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
//				 
//			 }			 
//		 }	
//		 return arr;
//	}
	
	
}
