package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class Datapro extends BaseClass {
	WebDriver driver;
	
@BeforeClass
private void launch() {
BaseClass.getDriver();
BaseClass.launchUrl("https://adactinhotelapp.com/");
}
@AfterClass
public void afterClass() {
	driver.quit();
}

@Test(dataProvider="Credentials")
public void login(String s1, String s2) {

BaseClass.findElementId("username").sendKeys(s1);

BaseClass.findElementId("password").sendKeys(s2);

BaseClass.findElementId("login").click();

}

@DataProvider(name="Credentials")
public Object[][] data(){
	return new Object[][] {{"Apple","Apple@123"}, {"Mango", "Mango@123"}, {"Orange", "Orange@123"},{"Pine", "Pine@123"},{"Bannana", "Bannana@123"},{"Dragon", "Dragon@123"},{"Yellow", "Yellow@123"},{"Bingo", "Bingo@123"},{"Pink", "Pink@123"}};
	
}

}