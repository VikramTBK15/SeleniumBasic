package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class SimpleAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@id='alertexamples']")).click();
		d.switchTo().alert().accept();
		System.out.println(d.findElement(By.xpath("//p[@id='alertexplanation']")).getText());

	}

}
