package seleniumWaitsCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ImpilicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		d.get("https://www.hyrtutorials.com/p/waits-demo.html");
		d.manage().window().maximize();

		d.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		d.findElement(By.xpath("(//input[@id='txt1'])[1]")).sendKeys("Vikram");

		d.findElement(By.xpath("//button[text()='Add Textbox2']")).click();
		d.findElement(By.xpath("(//input[@id='txt2'])[1]")).sendKeys("TBK");

	}

}
