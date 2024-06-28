package basicsSelenium;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://www.youtube.com/");
		d.manage().window().maximize();

		d.quit();
	}

}
