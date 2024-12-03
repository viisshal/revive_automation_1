package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Add_Banner_Fields extends ConfigClass_1{
	String folderpath = "/home/djaxtech-p/eclipse-workspace/mvn_1/src/images/Beluga300.jpg";
	
	// Finding elements
	
	By BanName = By.xpath("//input[@name='description']");
	By Ban_DesURL = By.id("url");
	By Ban_Target = By.id("target");
	By Ban_Alltxt = By.id("alt");
	By Ban_statustxt = By.id("statustext");
	By Ban_txt_below = By.id("bannertext");
	By Ban_keyword = By.id("keyword");
	By Ban_Comments = By.id("comments");
	By Ban_Submit = By.id("submit");
	By Upload_img = By.xpath("//input[@onchange='selectFile(this)']");
	
	// Reading from Excel
	
	String BanName_X = ExcelUtils.Add_new_adv(22,1);
	String Ban_DesURL_X = ExcelUtils.Add_new_adv(23,1);
	String Ban_Target_X = ExcelUtils.Add_new_adv(24,1);
	String Ban_Alltxt_X = ExcelUtils.Add_new_adv(25,1);
	String Ban_statustxt_X = ExcelUtils.Add_new_adv(26,1);
	String Ban_txt_below_X = ExcelUtils.Add_new_adv(27,1);
	String Ban_keyword_X = ExcelUtils.Add_new_adv(28,1);
	String Ban_Comments_X = ExcelUtils.Add_new_adv(29,1);
	String Ban_Submit_X = ExcelUtils.Add_new_adv(30,1);
	
	
	
	public void  add_ban_fields() {
		
		//WebElement UploadElement = driver.findElement(By.xpath(""));
		
		// Banner name
		
		driver.findElement(BanName).sendKeys(BanName_X);
		
		// Upload Banner
		
		driver.findElement(Upload_img).sendKeys(folderpath);
		
		// Banner Dest url
		
		driver.findElement(Ban_DesURL).sendKeys(Ban_DesURL_X);
		
		// Banner Target

		driver.findElement(Ban_Target).sendKeys(Ban_Target_X);
		
		// Banner All text
		
		driver.findElement(Ban_Alltxt).sendKeys(Ban_Alltxt_X);
		
		// Banner status text
		
		driver.findElement(Ban_statustxt).sendKeys(Ban_statustxt_X);
		
		// Banner text below
		
		driver.findElement(Ban_txt_below).sendKeys(Ban_txt_below_X);
		
		// Banner Keyword
		
		driver.findElement(Ban_keyword).sendKeys(Ban_keyword_X);
		
		// Banner comments
		
		driver.findElement(Ban_Comments).sendKeys(Ban_Comments_X);
		
		// Submit Banner
		
		driver.findElement(Ban_Submit).click();

		
				
		
		
		
		
	}
	

}
