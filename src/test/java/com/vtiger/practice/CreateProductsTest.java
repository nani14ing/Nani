package com.vtiger.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sdet34l1.genericlibrary.BaseClass;

public class CreateProductsTest extends BaseClass {
	
	@Test
	public void createOrganisationByExcelAndPFTest() {
		
	homepage.clickOnOrganization();
	
	List<WebElement> OrgName = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
	
	for(WebElement organName:OrgName)
	{
		if(!(organName.getText().equals("Organization Name"))) {
			System.out.println(organName.getText());
		}
	}
		
		
	}
}
