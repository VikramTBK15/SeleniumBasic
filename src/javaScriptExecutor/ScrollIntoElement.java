package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollIntoElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://demoqa.com/buttons");
		d.manage().window().maximize();

		WebElement Click = d.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		JavascriptExecutor jsClick = (JavascriptExecutor) d;
		jsClick.executeScript("arguments[0].scrollIntoView();", Click);

	}
	
}
