package firstTest;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class Fractions extends BaseTest {
	@Test(dataProvider = "testdata2")
	public void Test(String firstblank, String secondblank, String thirdblank, String fourthblank) {

		// Fractions Functionality
		driver.findElement(By.xpath(f_loc.getProperty("fractions"))).click();
		driver.findElement(By.name(f_loc.getProperty("fractions_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(f_loc.getProperty("fractions_second_blank"))).sendKeys(secondblank);
		driver.findElement(By.xpath(f_loc.getProperty("what_is_a_fraction_button"))).click();

		// Comparing Fractions Functionality
		driver.findElement(By.xpath(f_loc.getProperty("comparing_fractions"))).click();
		driver.findElement(By.name(f_loc.getProperty("comparing_fractions_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(f_loc.getProperty("comparing_fractions_second_blank"))).sendKeys(secondblank);
		driver.findElement(By.name(f_loc.getProperty("comparing_fractions_blank"))).sendKeys(thirdblank);
		driver.findElement(By.name(f_loc.getProperty("comparing_fractions_fourth_blank"))).sendKeys(fourthblank);
		driver.findElement(By.xpath(f_loc.getProperty("which_one_is_larger_button"))).click();
	}

	@DataProvider(name = "testdata2")
	public Object[][] tData() {
		return new Object[][] { { "10", "5", "4", "8" }, { "20", "15", "10", "30" }, { "30", "20", "10", "0" },
				{ "40", "10", "20", "30" } };
	}
}
