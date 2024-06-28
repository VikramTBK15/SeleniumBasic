package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class singleFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://chercher.tech/practice/frames");
		d.manage().window().maximize();

		// Frame 1 Nested Frame
		WebElement fr = d.findElement(By.xpath("//iframe[@id='frame1']"));
		d.switchTo().frame(fr);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Love is Beautiful");

		WebElement fr1 = d.findElement(By.xpath("//iframe[@id='frame3']"));
		d.switchTo().frame(fr1);
		d.findElement(By.xpath("//input[@id='a']")).click();
		
		d.switchTo().defaultContent();
		
		
		//Single Frame
		WebElement fr2 = d.findElement(By.xpath("//iframe[@id='frame2']"));
		d.switchTo().frame(fr2);
		System.out.println(d.findElement(By.xpath("//b[text()='Animals : ']")).getText());

	}

}
