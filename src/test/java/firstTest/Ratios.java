package firstTest;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class Ratios extends BaseTest {
	@Test(dataProvider = "testdata1")
	public void Test(String firstblank, String secondblank, String thirdblank, String fourthblank) {
		// Ratios Functionality
		driver.findElement(By.xpath(r_loc.getProperty("what_is_a_ratio"))).click();
		char ratio = 'A';
		switch (ratio) {
		case 'A': {
			driver.findElement(By.name(r_loc.getProperty("what_is_a_ratio_first_blank1"))).sendKeys(firstblank);
			driver.findElement(By.name(r_loc.getProperty("what_is_a_ratio_second_blank1"))).sendKeys(secondblank);
			driver.findElement(By.xpath(r_loc.getProperty("do_it_button"))).click();
		}
			break;
		case 'B': {
			driver.findElement(By.name(r_loc.getProperty("what_is_a_ratio_first_blank2"))).sendKeys(firstblank);
			driver.findElement(By.name(r_loc.getProperty("what_is_a_ratio_second_blank2"))).sendKeys(secondblank);
			driver.findElement(By.xpath(r_loc.getProperty("do_it_button"))).click();
		}
			break;
		case 'C': {
			driver.findElement(By.name(r_loc.getProperty("what_is_a_ratio_first_blank3"))).sendKeys(firstblank);
			driver.findElement(By.name(r_loc.getProperty("what_is_a_ratio_second_blank3"))).sendKeys(secondblank);
			driver.findElement(By.xpath(r_loc.getProperty("ratio_do_it_button"))).click();
		}
			break;
		}

		// Proportions Functionality
		driver.findElement(By.xpath(r_loc.getProperty("proportions"))).click();
		driver.findElement(By.name(r_loc.getProperty("proportions_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(r_loc.getProperty("proportions_second_blank"))).sendKeys(secondblank);
		driver.findElement(By.name(r_loc.getProperty("proportions_third_blank"))).sendKeys(thirdblank);
		driver.findElement(By.name(r_loc.getProperty("proportions_fourth_blank"))).sendKeys(fourthblank);
		driver.findElement(By.xpath(r_loc.getProperty("proportions_do_it_button"))).click();

	}

	@DataProvider(name = "testdata1")
	public Object[][] tData() {
		return new Object[][] { { "10", "5", "4", "8" }, { "20", "15", "10", "30" }, { "30", "20", "10", "0" },
				{ "40", "10", "20", "30" } };
	}
}