package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://stqatools.com/demo/MouseHover.php");
		d.manage().window().maximize();

		WebElement mh = d.findElement(By.xpath("//button[contains(text(),'Mouse Hover DropDown')]"));
		Actions ac = new Actions(d);
		ac.moveToElement(mh).build().perform();

		d.findElement(By.xpath("//a[text()='Link 2']")).click();

	}

}
