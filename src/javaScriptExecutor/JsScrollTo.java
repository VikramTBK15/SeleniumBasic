package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

public class JsScrollTo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://demoqa.com/buttons");
		d.manage().window().maximize();

		JavascriptExecutor jsClick = (JavascriptExecutor) d;
		jsClick.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // Down
		Thread.sleep(5000);
		jsClick.executeScript("window.scrollTo(0,document.body.scrollTop)"); // Up

	}

}
