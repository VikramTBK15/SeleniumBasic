package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@id='promptexample']")).click();
		Thread.sleep(5000);
		d.switchTo().alert().sendKeys("Automation is Fun");
		System.out.println(d.switchTo().alert().getText());
		Thread.sleep(5000);
		d.switchTo().alert().accept();

		System.out.println(d.findElement(By.xpath("//p[@id='promptexplanation']")).getText());

	}

}
