package firstTest;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class OtherStuff extends BaseTest {
	
	@Test(dataProvider = "testdata2")
	public void Test(String firstblank) {
		// The Metric System Functionality
		driver.findElement(By.xpath(os_loc.getProperty("the_metric_system"))).click();
		char the_metric_system = 'A';
		switch (the_metric_system) {
		case 'A':// lbstokg
		{
			driver.findElement(By.name(r_loc.getProperty("lbstokg_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("lbstokg_do_it_button"))).click();
		}
			break;
		case 'B':// kgtolbs
		{
			driver.findElement(By.name(r_loc.getProperty("kgtolbs_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("kgtolbs_do_it_button"))).click();
		}
			break;
		case 'C':// oztog
		{
			driver.findElement(By.name(r_loc.getProperty("oztog_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("oztog_do_it_button"))).click();
		}
			break;
		case 'D':// gtooz
		{
			driver.findElement(By.name(r_loc.getProperty("gtooz_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("gtooz_do_it_button"))).click();
		}
			break;
		case 'E':// fttom
		{
			driver.findElement(By.name(r_loc.getProperty("fttom_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("fttom_do_it_button"))).click();
		}
			break;
		case 'F':// mtoft
		{
			driver.findElement(By.name(r_loc.getProperty("mtoft_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("mtoft_do_it_button"))).click();
		}
			break;
		case 'G':// mtokm
		{
			driver.findElement(By.name(r_loc.getProperty("mtokm_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("mtokm_do_it_button"))).click();
		}
			break;
		case 'H':// kmtom
		{
			driver.findElement(By.name(r_loc.getProperty("kmtom_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("kmtom_do_it_button"))).click();
		}
			break;
		case 'I':// galtol
		{
			driver.findElement(By.name(r_loc.getProperty("galtol_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("galtol_do_it_button"))).click();
		}
			break;
		case 'J':// ltogal
		{
			driver.findElement(By.name(r_loc.getProperty("ltogal_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("ltogal_do_it_button"))).click();
		}
			break;
		case 'K':// mphtokmph
		{
			driver.findElement(By.name(r_loc.getProperty("mphtokmph_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("mphtokmph_do_it_button"))).click();
		}
			break;
		case 'L':// kmphtomph
		{
			driver.findElement(By.name(r_loc.getProperty("kmphtomph_blank"))).sendKeys(firstblank);
			driver.findElement(By.xpath(r_loc.getProperty("kmphtomph_do_it_button"))).click();
		}
			break;
		}
	}
	@DataProvider(name = "testdata2")
	public Object[][] tData() {
		return new Object[][] { { "10" }, { "20"}, { "30"}, { "40" } };
	}
}
