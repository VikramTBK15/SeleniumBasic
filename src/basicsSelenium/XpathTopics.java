package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathTopics {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://www.westside.com/collections/t-shirts-western-wear-for-women");
		d.manage().window().maximize();

		// Absolute Xpath
		/*
		 * We do not use this Xpath commonly It will have entire address from source to
		 * destination - It starts from '/' single slash
		 */

		
		  d.findElement(By.xpath(
		  "/html/body/main/div[3]/div[7]/div/div[2]/div[1]/div[3]/div/div[1]/form/div/div/a/i"
		  ));
		  
		  // Relative Xpath
//		  
//		  d.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
//		  d.findElement(By.xpath("//input[@id='verify_mNum']")).sendKeys("8523698521");
		 

		// Dynamic Xpath

		/*d.findElement(By.xpath(
				"(//div[contains(text(),'The Derma Co 1% Hyaluronic Sunscreen and 2% Salicylic Serum Combo')])[1]/parent::div/preceding-sibling::div/descendant::img[1]"))
				.click();*/
		d.findElement(By.xpath("//a[contains(text(),'LOV Black Sequin Embellished Cotton T-Shirt')]/ancestor::div[2]/preceding-sibling::div/descendant::i")).click();

	}

}
