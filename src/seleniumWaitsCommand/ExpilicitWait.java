package seleniumWaitsCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://www.hyrtutorials.com/p/waits-demo.html");
		d.manage().window().maximize();

		d.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		
		WebDriverWait exwait = new WebDriverWait(d, 10);
		exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='txt1'])[1]")))
				.sendKeys("Vikram");

		d.findElement(By.xpath("//button[text()='Add Textbox2']")).click();

		WebDriverWait ex1wait = new WebDriverWait(d, 15);
		ex1wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='txt2'])[1]")))
				.sendKeys("TBK");

	}

}
