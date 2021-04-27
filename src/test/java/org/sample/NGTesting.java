package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NGTesting {
WebDriver driver;
@BeforeClass
private void beforeClass() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
}

@Test
@Parameters({ "Firstname", "last", "address", "email", "Phone", "pass", "spass" })
private void demo(String Firstname, String last, String address, String email, String Phone, String pass,
String spass) throws AWTException, InterruptedException {

driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(last);
driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"))
.sendKeys(address);
driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(email);
driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(Phone);
driver.findElement(By.xpath("//input[@value='Male']")).click();
driver.findElement(By.xpath("//input[@value='Cricket']")).click();
driver.findElement(By.id("firstpassword")).sendKeys(pass);
driver.findElement(By.id("secondpassword")).sendKeys(spass);
WebElement skill = driver.findElement(By.id("Skills"));
Select se = new Select(skill);
se.selectByVisibleText("Analytics");
WebElement cont = driver.findElement(By.id("countries"));
Select sel = new Select(cont);
sel.selectByVisibleText("Afghanistan");
WebElement year = driver.findElement(By.id("yearbox"));
Select sele = new Select(year);
sele.selectByIndex(20);
WebElement txtmonth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
Select selec = new Select(txtmonth);
selec.selectByVisibleText("March");
WebElement txtdays = driver.findElement(By.id("daybox"));
Select select = new Select(txtdays);
select.selectByIndex(5);
driver.findElement(By.id("msdd")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Arabic']")).click();
driver.findElement(By.xpath("//label[text()='Languages']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@role='combobox']")).click();
Robot rb = new Robot();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
driver.findElement(By.id("submitbtn")).click();
}
}
