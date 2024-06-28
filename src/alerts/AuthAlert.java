package alerts;

import org.openqa.selenium.edge.EdgeDriver;

public class AuthAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\basicsSelenium\\Driver\\msedgedriver.exe");

		EdgeDriver d = new EdgeDriver();

		d.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-results.html");
		d.manage().window().maximize();

	}

}
