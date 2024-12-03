package config;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin_account_Managers_ListPage extends ConfigClass_1 {
	
	String Mng_name = ExcelUtils.Add_new_adv(11,1);
	WebElement cell;
	String xp1;
	
	public void Switch_to_manger() {
		
		WebElement Table = driver.findElement(By.xpath("//table[@width='100%'][1]"));
		
  	  
  	 
		
		
		List<WebElement> rows = Table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
		    List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
		    for (int j = 0; j < cells.size(); j++) {
		    	cell = cells.get(j);
		        // Check if this is the element you are looking for
		    	
		    	
		        if (cell.getText().equals(Mng_name)) {
		            // Construct XPath based on row and cell indices (1-based)
		            String xpath = String.format("//*[@height='25'][1]//tr[%d]//td[%d]//a", i + 1, j + 1);
		            System.out.println("XPath of the element: " + xpath);
		            String xp = xpath.replace("//*[@height='25']","//*[@width='100%']");
		            System.out.println(xp);
		             xp1 = xp.replace("td[1]","td[6]");
		            System.out.println(xp1);
		           // driver.findElement(By.xpath("xp1")).click();
		                       
		            
		        }
		    }
		}
	
	  WebElement element = driver.findElement(By.xpath(xp1));
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

  	int attempts = 0;

      while(attempts < 2) {
          try {
              wait.until(ExpectedConditions.elementToBeClickable(element));
              element.click();
              break;
          } catch (StaleElementReferenceException e) {
              element = driver.findElement(By.id("xp1")); // Re-locate the element
          }
          attempts++;
      }
}
}



	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		//List<WebElement> NoRows = driver.findElements(By.xpath("//table[@width='100%'][1]//tr"));
		/*
		 * WebElement Table = driver.findElement(By.xpath("//table[@width='100%'][1]"));
		 * List<WebElement> no_rows =
		 * Table.findElements(By.xpath("//table[@width='100%'][1]//tr")); for (
		 * WebElement row: no_rows) { System.out.println(row.getText()); if
		 * (row.getText().contains(Mng_name)) { System.out.println("Its true"); List
		 * <WebElement> no_cols =
		 * Table.findElements(By.xpath("//table[@width='100%'][1]//td")); for
		 * (WebElement col:no_cols) { if (col.getDomProperty(Mng_name) != null) {
		 * System.out.println(col.getDomProperty(Mng_name));
		 * 
		 * } }
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		
	
		/*
		 * List<WebElement> NoCol =
		 * driver.findElements(By.xpath("//table[@width='100%'][1]//td")); int rowCol =
		 * NoCol.size() ; System.out.println("The total number of rows are : "+rowCol);
		 * 
		 * 
		 * WebElement CellAddress =
		 * driver.findElement(By.xpath("//table[@width='100%'][1]//tr[9]//td[1]"));
		 * String value = CellAddress.getText();
		 * System.out.println("The cell value is :"+value);
		 */
		
		//driver.findElement(By.xpath("//table[@width='100%'][1]//tr[9]//td[6]/a")).click();
		




	


