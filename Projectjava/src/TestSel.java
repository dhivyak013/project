

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class TestSel {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\ELCOT\\eclipse-workspace\\sel\\driver\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("https://www.selenium.dev/downloads/");
driver.manage().window().maximize();
String url = driver.getCurrentUrl();
System.out.println(url);
String title = driver.getTitle();
System.out.println(title);
System.out.println("dhivya");
driver.close();
	}

}