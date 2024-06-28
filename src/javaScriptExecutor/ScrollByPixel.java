package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollByPixel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://demoqa.com/buttons");
		d.manage().window().maximize();

		JavascriptExecutor jsClick = (JavascriptExecutor) d;
		jsClick.executeScript("window.scrollBy(0,1000)", ""); // Down
		Thread.sleep(5000);
		jsClick.executeScript("window.scrollBy(0,-300)", ""); // Up

	}
}
