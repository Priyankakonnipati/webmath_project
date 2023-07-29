package base;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties hp_loc = new Properties();
	public static Properties nb_loc = new Properties();
	public static Properties r_loc = new Properties();
	public static Properties f_loc = new Properties();
	public static Properties os_loc = new Properties();
	public static FileReader fr;
	public static FileReader homePage;
	public static FileReader numberBasics;
	public static FileReader ratios;
	public static FileReader fractions;
	public static FileReader otherStuff;

	@BeforeTest
	public void setup() {

		if (driver == null) {
			try {
				fr = new FileReader(
						System.getProperty("user.dir") + "/src/test/resources/configfiles/config.properties");
				homePage = new FileReader(System.getProperty("user.dir")
						+ "/src/test/resources/configfiles/homepage_locators.properties");
				numberBasics = new FileReader(System.getProperty("user.dir")
						+ "/src/test/resources/configfiles/numberbasics_locators.properties");
				ratios = new FileReader(
						System.getProperty("user.dir") + "/src/test/resources/configfiles/ratios_locators.properties");
				fractions = new FileReader(System.getProperty("user.dir")
						+ "/src/test/resources/configfiles/fractions_locators.properties");
				otherStuff = new FileReader(System.getProperty("user.dir")
						+ "/src/test/resources/configfiles/otherstuff_locators.properties");
				prop.load(fr);
				hp_loc.load(homePage);
				nb_loc.load(numberBasics);
				r_loc.load(ratios);
				f_loc.load(fractions);
				os_loc.load(otherStuff);
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("testurl"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("testurl"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("testurl"));
			}
		}
	}

	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();

	}
}
