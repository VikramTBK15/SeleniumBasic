package basicsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		// Get Methods:

		d.get("https://demo.automationtesting.in/Windows.html");
		d.manage().window().maximize();
		System.out.println("Current URL is :- " + d.getCurrentUrl());
		System.out.println("Current tab title is:- " + d.getTitle());
		System.out.println(d
				.findElement(By.xpath(
						"//img[contains(@alt,'image not displaying')]/parent::a/parent::div/following-sibling::div/h1"))
				.getText());

		// Navigate Methods:

		d.navigate().to("https://www.tirabeauty.com/");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();

		// Conditional Methods:

		d.navigate().to("https://faculty.washington.edu/chudler/java/boxes.html");
		System.out.println(d.findElement(By.xpath("//input[@value='restart']")).isDisplayed());
		System.out.println(d.findElement(By.xpath("//input[@type='checkbox'][12]")).isEnabled());
		System.out.println(d.findElement(By.xpath("//input[@type='checkbox'][15]")).isSelected());

		// Browser Methods:

//		d.close();
		d.quit();

	}
}
