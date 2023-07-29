package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// enter url
		driver.get("https://www.webmath.com/index3.html");
		// click on home button
		driver.findElement(By.xpath("//*[@id=\"navBox-0\"]/a")).click();
		// check few drop down functionalities.
		Select dropdown = new Select(driver.findElement(By.id("topicItem")));
		dropdown.selectByVisibleText("Calculus, Derivatives");
		dropdown.selectByIndex(1);
		dropdown.selectByValue("diff.html");
		// check the go button functionality.
		driver.findElement(By.xpath("//*[@id=\"jumpToPage\"]/div/a/img"));
		// quit once done
		driver.close();
	}

}
