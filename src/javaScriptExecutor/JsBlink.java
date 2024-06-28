package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JsBlink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://demoqa.com/buttons");
		d.manage().window().maximize();

		WebElement Click = d.findElement(By.xpath("//button[text()='Click Me']"));
		JavascriptExecutor jsClick = (JavascriptExecutor) d;
		jsClick.executeScript("arguments[0].style.backgroundColor= 'Red'", Click);
		Thread.sleep(5000);
		jsClick.executeScript("arguments[0].style.backgroundColor= 'Black'", Click);

	}

}
