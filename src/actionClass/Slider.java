package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://demo.automationtesting.in/Slider.html");
		d.manage().window().maximize();

		WebElement sl0 = d.findElement(By.xpath("//a[@style='left: 0%;']"));
		Actions ac = new Actions(d);
		ac.moveToElement(sl0).dragAndDropBy(sl0, 500, 0).build().perform();

	}

}
