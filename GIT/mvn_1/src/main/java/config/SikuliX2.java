package config;



import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliX2 extends ConfigClass_1 {
	
	WebElement a;
	
	

	
		public static void Ftp() {
			
			Screen s = new Screen();
			try {
				s.find("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/FTP.png");
				s.click();
				
				
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Pattern dropdownArrow = new Pattern("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/Server_3.png");
			Pattern connect = new Pattern("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/connect_4.png");
			Pattern textbox = new Pattern("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/textbox1.png");
			try {
				s.wait(dropdownArrow, 10);
				s.click(dropdownArrow);
				s.wait(connect, 10);
				//s.find("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/Connect_server8.png");
				s.click(connect);
				s.wait(textbox, 20);
				s.click(textbox);
				s.type("a",Key.CTRL);
				s.type(Key.DELETE);
				s.type("/home/ubuntu/html/magicbic_headerbidding");
				s.type(Key.ENTER);
				
				
				

}
			
		catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			Pattern scrollDownPattern = new Pattern("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/scroll1.png");
			Pattern Auto = new Pattern("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/Automation.png");
			Pattern Pasetinvo = new Pattern("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/PasteInvo.png");
			try {
				s.wait(scrollDownPattern, 10);
				s.click(scrollDownPattern);
				for (int i=1;i<=20;i++) {
					s.type(Key.PAGE_DOWN);
					if (s.exists(Auto, 2)!=null) {
						
						s.rightClick(Auto);
						s.type(Key.DOWN);
						s.type(Key.DOWN);
						s.type(Key.DOWN);
						s.type(Key.ENTER);
						Thread.sleep(6000);
						Zone Z = new Zone();
						String invo = Z.AsyncTag();
						Thread.sleep(9000);
						
						StringSelection stringSelection = new StringSelection(invo);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
						
						Thread.sleep(9000);
						
						s.click(Pasetinvo);
						s.paste(invo);
						
						s.type("s",Key.CTRL);
						
						
						break;
						
					}
					
					
					
					
					
					
					
				} 
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			try {
				s.find("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/FTP.png");
				s.click();
				
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				s.find("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/Alert.png");
				s.find("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/Saveing_invo.png");
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				s.find("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/RefershFTP.png");
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.click();
			
			try {
				Thread.sleep(3000);
				s.find("/home/djaxtech-p/eclipse-workspace/MVN_2/src/screenshots_sikulix/Chrome.png");
				s.click();
				s.type(Key.ENTER);
				driver.get("https://revphpe.djaxbidder.com/magicbic_headerbidding/AUTOMATION.php");
				for (int i=1;i<=3;i++) {
					driver.navigate().refresh();
				
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
				
		
		}
}