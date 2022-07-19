package com.ScenariosTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationScript11 {

	public static void main(String[] args) {
		
		Actions act;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tnqtestlab@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("test@1234");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		WebElement womendrpdown = driver.findElement(By.xpath("//a[.='Women']"));
		act=new Actions(driver);
		act.moveToElement(womendrpdown).perform();
		driver.findElement(By.xpath("//a[@title='Tops']/../following-sibling::li[@class='sfHover']/descendant::a[.='Summer Dresses']")).click();
		
		driver.findElement(By.xpath("//a[@title='List']")).click();
		
		WebElement img = driver.findElement(By.xpath("//li[@class='ajax_block_product first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line col-xs-12']/descendant::img[@class='replace-2x img-responsive']"));
        act.moveToElement(img).perform();
        driver.findElement(By.xpath("//li[@class='ajax_block_product first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line col-xs-12']/descendant::a[@class='quick-view']")).click();
        
        driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/descendant::input[@id='quantity_wanted']")).clear();
        driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/descendant::input[@id='quantity_wanted']")).sendKeys("3");
        
        
      //  String expSize="4";           	
       // String currentSize = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']/descendant::i[@class='icon-plus']")).getText();

        
        WebElement drpdown = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
        Select s=new Select(drpdown);
        s.deselectByVisibleText("L");
		
	}

}
