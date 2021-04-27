package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoBase extends BaseClass {
@BeforeClass
	private void launch() {
		BaseClass.getDriver();
		BaseClass.launchUrl("http://demo.automationtesting.in/Register.html");
	}
@AfterClass
private void quit1() {
}
@BeforeMethod
private void beforeDate() {
Date date = new Date();
System.out.println(date);
}
@AfterMethod
private void afterDate() {
Date date = new Date();
System.out.println(date);
}
@Test
private void demo() throws IOException, AWTException, InterruptedException {
WebElement firstn = BaseClass.findElementXpath("//input[@placeholder='First Name']");
firstn.sendKeys(BaseClass.filecreationpath("C:\\Users\\LT07052020\\eclipse-workspace\\NGTest1\\Excel\\DemoBase.xlsx", "sheet1", 0, 0));
String name = firstn.getAttribute("value");
Assert.assertEquals(name, "Apple");
WebElement last = BaseClass.findElementXpath("//input[@placeholder='Last Name']");
last.sendKeys(BaseClass.filecreationpath("C:\\Users\\LT07052020\\eclipse-workspace\\NGTest1\\Excel\\DemoBase.xlsx", "sheet1", 1, 0));
String lastn= last.getAttribute("value");
Assert.assertEquals(lastn, "Mango");
WebElement address = BaseClass.findElementXpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']");
address.sendKeys(BaseClass.filecreationpath("C:\\Users\\LT07052020\\eclipse-workspace\\NGTest1\\Excel\\DemoBase.xlsx", "sheet1", 2, 0));
String add= address.getAttribute("value");
Assert.assertEquals(add, "10 Hilltop, Wellington");
WebElement email = BaseClass.findElementXpath("//input[@ng-model='EmailAdress']");
email.sendKeys(BaseClass.filecreationpath("C:\\Users\\LT07052020\\eclipse-workspace\\NGTest1\\Excel\\DemoBase.xlsx", "sheet1", 3, 0));
String ema= email.getAttribute("value");
Assert.assertEquals(ema, "acsa@gmail.com");
WebElement phone = BaseClass.findElementXpath("//input[@ng-model='Phone']");
phone.sendKeys(BaseClass.filecreationpath("C:\\Users\\LT07052020\\eclipse-workspace\\NGTest1\\Excel\\DemoBase.xlsx", "sheet1", 4, 0));
String phno= phone.getAttribute("value");
Assert.assertEquals(phno, "8015822323");
WebElement fpassword = BaseClass.findElementId("firstpassword");
fpassword.sendKeys(BaseClass.filecreationpath("C:\\Users\\LT07052020\\eclipse-workspace\\NGTest1\\Excel\\DemoBase.xlsx", "sheet1", 5, 0));
String fpw= fpassword.getAttribute("value");
Assert.assertEquals(fpw, "abc@123");
WebElement spassword = BaseClass.findElementId("secondpassword");
spassword.sendKeys(BaseClass.filecreationpath("C:\\Users\\LT07052020\\eclipse-workspace\\NGTest1\\Excel\\DemoBase.xlsx", "sheet1", 6, 0));
String spw= spassword.getAttribute("value");
Assert.assertEquals(spw, "abc@123");
WebElement btnClick = BaseClass.findElementXpath("//input[@value='Male']");
btnClick.click();
boolean f = btnClick.isSelected();
Assert.assertTrue(f);
BaseClass.findElementXpath("//input[@value='Cricket']").click();
BaseClass.selectByVisibleText(BaseClass.findElementId("Skills"),"Analytics");
BaseClass.selectByIndex(BaseClass.findElementId("countries"),2);
BaseClass.selectByIndex(BaseClass.findElementId("yearbox"), 20);
BaseClass.selectByVisibleText(BaseClass.findElementXpath("//select[@ng-model='monthbox']"), "March");
BaseClass.selectByIndex(BaseClass.findElementId("daybox"), 20);
BaseClass.findElementId("msdd").click();
BaseClass.findElementXpath("//a[text()='Arabic']").click();
BaseClass.findElementXpath("//label[text()='Languages']").click();
Thread.sleep(3000);
BaseClass.findElementXpath("//span[@role='combobox']").click();
Robot rb = new Robot();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
}
}