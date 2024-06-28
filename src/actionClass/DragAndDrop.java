package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://stqatools.com/demo/Drag&Drop.php");
		d.manage().window().maximize();

		WebElement mw1 = d.findElement(By.xpath("//img[@id='dragA']"));
		WebElement mw2 = d.findElement(By.xpath("//div[@id='dropBox']"));

		Actions ac = new Actions(d);

//		ac.dragAndDrop(mw1, mw2).build().perform();

		ac.clickAndHold(mw1).moveToElement(mw2).release().build().perform();

	}

}
