package seleniumWaitsCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://www.hyrtutorials.com/p/waits-demo.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("(//input[@id='txt1'])[1]")).sendKeys("vikram");
		d.findElement(By.xpath("//button[text()='Add Textbox2']")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("(//input[@id='txt2'])[1]")).sendKeys("TBK");

	}

}
