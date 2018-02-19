package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyFB_UNandPW_intheSameRow extends launch {

	public static void main(String[] args) {
		
driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=257740484756760&extra_1=s|c|231348943360|e|facebook|&placement=&creative=231348943360&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI1ejEwc_C2AIVTx0rCh3QTAw6EAAYASAAEgJjDPD_BwE");

driver.findElement(By.id("u_0_a")).click();
WebElement un_TB = driver.findElement(By.id("email"));
int username_yaxis = un_TB.getLocation().getY();
System.out.println(username_yaxis);
WebElement pass_TB = driver.findElement(By.id("pass"));
int password_yaxis = pass_TB.getLocation().getY();
System.out.println(password_yaxis);
if (username_yaxis==password_yaxis) {
	System.out.println("username and password is aligned are in same row");
	
} else {
System.out.println("are NOT aligned ");
}
	}

}
