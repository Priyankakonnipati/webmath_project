package firstTest;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class NumberBasics extends BaseTest {
	@Test
	public void help() {
		driver.findElement(By.xpath(nb_loc.getProperty("help"))).click();
	}

	@Test(dataProvider = "testdata")
	public void Test(String firstblank, String secondblank) {
		// Add Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("add"))).click();
		driver.findElement(By.name(nb_loc.getProperty("add_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(nb_loc.getProperty("add_second_blank"))).sendKeys(secondblank);
		driver.findElement(By.xpath(nb_loc.getProperty("add_button"))).click();
		// Subtract Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("subtract"))).click();
		driver.findElement(By.name(nb_loc.getProperty("subtract_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(nb_loc.getProperty("subtract_second_blank"))).sendKeys(secondblank);
		driver.findElement(By.xpath(nb_loc.getProperty("subtract_button"))).click();
		// Multiply Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("multiply "))).click();
		driver.findElement(By.name(nb_loc.getProperty("multiply_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(nb_loc.getProperty("multiply_second_blank"))).sendKeys(secondblank);
		driver.findElement(By.xpath(nb_loc.getProperty("multiply_button"))).click();
		// Divide Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("divide"))).click();
		driver.findElement(By.name(nb_loc.getProperty("divide_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(nb_loc.getProperty("divide_second_blank"))).sendKeys(secondblank);
		driver.findElement(By.xpath(nb_loc.getProperty("divide_button"))).click();
		// Place Value Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("place_value"))).click();
		driver.findElement(By.name(nb_loc.getProperty("place_value_number"))).sendKeys(firstblank);
		driver.findElement(By.xpath(nb_loc.getProperty("take_my_number"))).click();
		// Rounding Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("rounding"))).click();
		driver.findElement(By.name(nb_loc.getProperty("rounding_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.name(nb_loc.getProperty("rounding_second_blank"))).isSelected();
		driver.findElement(By.xpath(nb_loc.getProperty("round_it_button"))).click();
		// Using A Number Line Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("using_a_number_line"))).click();
		driver.findElement(By.name(nb_loc.getProperty("using_a_number_line_first_blank"))).sendKeys(firstblank);
		driver.findElement(By.xpath(nb_loc.getProperty("show_me_button"))).click();
		// Comparing With A Number Line Functionality
		driver.findElement(By.xpath(nb_loc.getProperty("comparing_with_a_number_line"))).click();
		driver.findElement(By.name(nb_loc.getProperty("comparing_with_a_number_line_first_blank")))
				.sendKeys(firstblank);
		driver.findElement(By.name(nb_loc.getProperty("comparing_with_a_number_line_second_blank")))
				.sendKeys(secondblank);
		driver.findElement(By.xpath(nb_loc.getProperty("show_me_button"))).click();

	}

	@DataProvider(name = "testdata")
	public Object[][] tData() {
		return new Object[][] { { "10", "5" }, { "20", "15" }, { "30", "20" }, { "40", "10" } };
	}
}