package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyFb_UserTb_andMobTb extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=257740484756760&extra_1=s|c|231348943360|e|facebook|&placement=&creative=231348943360&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI1ejEwc_C2AIVTx0rCh3QTAw6EAAYASAAEgJjDPD_BwE");
		Thread.sleep(3000);
				driver.findElement(By.id("u_0_a")).click();
				WebElement unTB = driver.findElement(By.id("email"));
				int un_width = unTB.getSize().getWidth();
				int un_height = unTB.getSize().getHeight();
				System.out.println(un_width);
				System.out.println(un_height);
				WebElement mobTB = driver.findElement(By.id("u_0_m"));
				int mob_width = mobTB.getSize().getWidth();
				int mob_height = mobTB.getSize().getHeight();
		System.out.println(mob_width);
		System.out.println(mob_height);
		if (un_width==mob_width && un_height==mob_height) {
			System.out.println("Size of Both username and password fields are same" +un_width+" = " + mob_width); 
		} else {
			System.out.println("Size of username and password fields are NOT same that is :" +un_width+ " Not equals to " + mob_width);

		}
		

	}

}
