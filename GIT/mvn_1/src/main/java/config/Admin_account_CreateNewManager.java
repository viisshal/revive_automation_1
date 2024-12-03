package config;

import org.openqa.selenium.By;

public class Admin_account_CreateNewManager extends ConfigClass_1{
	
	//Finding the paths
	
	By Manager_Name = By.id("name");
	By Manager_Contact = By.id("contact");
	By Manager_Email = By.id("email");
	By Manager_Submit = By.id("submit");
	
	//Reading from the Excel
	
	String Manager_Name_X = ExcelUtils.Add_new_adv(11,1);
	int Manager_Contact_X = ExcelUtils.Add_new_adv_int(12,1);
	String Manager_Email_X = ExcelUtils.Add_new_adv(13,1);
	
	public void Admin_Acc_New_Mangers() {
		
		//span[@class='label']
		
		//Clearing the Manager Name field
		driver.findElement(Manager_Name).clear();

		//Enter Manager Name
		driver.findElement(Manager_Name).sendKeys(Manager_Name_X);
		
		//Enter Manager Contact number
		driver.findElement(Manager_Contact).sendKeys(String.valueOf(Manager_Contact_X));
		
		//Enter Manager Email id
		driver.findElement(Manager_Email).sendKeys(Manager_Email_X);
		
		//Click submit in manager field after entering all details
		driver.findElement(Manager_Submit).click();


		

		
		
	}
	
	
	

}
