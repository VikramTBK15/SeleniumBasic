package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		d.manage().window().maximize();

		WebElement selectdrop = d.findElement(By.xpath("//select[@id='first']"));

		Select s = new Select(selectdrop);

		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("Apple");
		Thread.sleep(3000);
		s.selectByVisibleText("Yahoo");
		

		List<WebElement> getopt = s.getOptions();
		for (WebElement weba : getopt) {
			String text = weba.getText();
			System.out.println(text);

		}

	}

}
