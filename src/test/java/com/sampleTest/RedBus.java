package com.sampleTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws  IOException, InterruptedException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/amazon.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		    
		String from = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String to = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String monthyear=wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		 Sheet sheet = wb.getSheet("Sheet1");
	     Row row = sheet.getRow(1);
	     Cell cell = row.getCell(5);
	     DataFormatter format=new DataFormatter();
	     String date = format.formatCellValue(cell);
	     
	     System.out.println(from);
	     System.out.println(to);
	     System.out.println(monthyear);
	     System.out.println(date);
	     
	     // System.out.println(monthyear);
	     //System.out.println(date);
	     	 
	    //wb.close();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(from);
		driver.findElement(By.xpath("//input[@id='src']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(to);
		driver.findElement(By.xpath("//input[@id='dest']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Date']")).click();
		driver.findElement(By.xpath("//table/tbody/tr[contains(.,'"+monthyear+"')]/../tr/td[text()='"+date+"']")).click();
		
	}

}
