package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected static Properties prop;
	protected static WebDriver driver;

	// cunstructor for creating object of properties file
	public BaseClass()

	{
		prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\Configuration\\Config.properties";

		try {

			// read properties file
			FileInputStream fis = new FileInputStream(path);
			// load properties file
			prop.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void inilization() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = prop.getProperty("URL");
		driver.get(url);

	}

}
