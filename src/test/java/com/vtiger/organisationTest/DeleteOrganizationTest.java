package com.vtiger.organisationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sdet34l1.genericlibrary.BaseClass;
import com.vtiger.ObjectRepository.CreateNewOrganizationPage;
import com.vtiger.ObjectRepository.OrganizationInformationPage;
import com.vtiger.ObjectRepository.OrganizationPage;

public class DeleteOrganizationTest extends BaseClass{

	String organization_name;
	OrganizationPage OrgPage;
	CreateNewOrganizationPage createNewOrgPage;
	OrganizationInformationPage Org_info_page;
	//MSExcelLibrary msExcelLibrary;
	
	@Test
	public void createOrganisationByExcelAndPFTest() throws InterruptedException {
		
	organization_name = msExcelLibrary.getDataFromExcel("CreateOrganizationTest", 1, 1)+randomNumber;

	OrganizationPage OrgPage=new OrganizationPage(driver);
	CreateNewOrganizationPage createNewOrgPage=new CreateNewOrganizationPage(driver);
	OrganizationInformationPage Org_info_page= new OrganizationInformationPage(driver);
	
 	
	homepage.clickOnOrganization();
 	
	OrgPage.createOrganization();
			
	createNewOrgPage.enterOrganizationName(organization_name);
	
	createNewOrgPage.SaveOrg();
	
	Thread.sleep(2000);
	
    homepage.clickOnOrganization();
    
/*
	List<WebElement> OrgName = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
	
	for(WebElement organName:OrgName)
	{
		if(organName.getText().equals(organization_name)){
			
			System.out.println(organization_name);			
			
		}
	}
*/

	 List<WebElement> delete = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/preceding-sibling::td[2]"));
	 
	 for(WebElement delete_Orgn:delete)
	 {
		 if(delete_Orgn.equals(organization_name)) {
			 delete_Orgn.click();
		 }
	 }
	
	
}
}
