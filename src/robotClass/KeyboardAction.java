package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyboardAction {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://engage.cloud.microsoft/main/org/maveric-systems.com/feed");
		d.manage().window().maximize();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(20000);

		d.findElement(By.xpath("//div[contains (text(),'Share thoughts, ideas, or updates')]")).click();

		Thread.sleep(10000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement w = d.findElement(By.xpath("//span[text()='Select a community or storyline']"));
		JavascriptExecutor js = (JavascriptExecutor) d;	
		js.executeScript("arguments[0].click();", w);
		Thread.sleep(10000);
		d.findElement(By.xpath("//div[contains(text(), 'My storyline')]")).click();

	}

}
