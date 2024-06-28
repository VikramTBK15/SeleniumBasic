package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://demoqa.com/buttons");
		d.manage().window().maximize();
		
		TakesScreenshot ts = d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new  File("C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\CuurentScreenShot\\Done.png");
		FileUtils.copyFile(src, trg);
		
		d.quit();
		

	
	}
}
