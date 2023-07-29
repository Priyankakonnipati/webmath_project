package firstTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class HomePage extends BaseTest {

	@Test
	public void Test() {
		// click on home button
		driver.findElement(By.xpath(hp_loc.getProperty("home"))).click();
		// check few drop down functionalities.
		WebElement dropdown = driver.findElement(By.id(hp_loc.getProperty("dropdown")));
		Select select = new Select(dropdown);
		select.selectByValue(hp_loc.getProperty("Calculus, Derivatives"));
		select.selectByVisibleText(hp_loc.getProperty("Coins,Counting"));
		// check the go button functionality.
		driver.findElement(By.xpath(hp_loc.getProperty("go_button")));
		driver.navigate().to(hp_loc.getProperty("k8_math"));
	}
}
