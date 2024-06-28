package windowHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindowHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();
		Robot r = new Robot();

		d.get("https://demo.automationtesting.in/Windows.html");
		d.manage().window().maximize();

		d.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();

		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		d.findElement(By.xpath("//button[text()='click ']")).click();

		// 1st window Index
		String tit = "Index";
		Set<String> AllId = d.getWindowHandles();
		for (String Id : AllId) {
			String CurrentWindowTitle = d.switchTo().window(Id).getTitle();
			if (tit.equals(CurrentWindowTitle)) {
				break;
			}
		}
		d.findElement(By.xpath("//button[text()='Sign In']")).click();

		Thread.sleep(5000);

		// 2nd window Frames & windows
		String tit1 = "Frames & windows";
		Set<String> AllId1 = d.getWindowHandles();
		for (String Id1 : AllId1) {
			String CurrentWindowTitle1 = d.switchTo().window(Id1).getTitle();
			if (tit1.equals(CurrentWindowTitle1)) {
				break;
			}
		}
		d.findElement(By.className("analystic")).click();
	}

}
