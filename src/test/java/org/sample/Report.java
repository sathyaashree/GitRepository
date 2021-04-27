package org.sample;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report extends BaseClass {
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	
	@BeforeClass
	private void beforeClass() throws InterruptedException {
    reports=new ExtentReports();
    htmlReporter=new ExtentHtmlReporter("AdactinE2E.html");
    reports.attachReporter(htmlReporter);
    getDriver();
    launchUrl("https://adactinhotelapp.com/");
    Thread.sleep(3000);
    }
	@BeforeMethod
	private void beforeMethod() {
		Date date=new Date();
		System.out.println(date);
    }
	@AfterMethod
	private void afterMethod(Method method) {
		screenShot(method.getName());
	}
    @Test
    private void testing() throws IOException {
    	test=reports.createTest("Page Validation");
    	test.log(Status.INFO, "Verify Url");
    	if (driver.getCurrentUrl().contains("index")) {
    		test.log(Status.PASS, "Valid Url");
    	}
    	else {
			test.log(Status.FAIL, "Invalid Url");
		}
    	WebElement logo = driver.findElement(By.className("logo"));
    	if (logo.isDisplayed()) {
    	test.log(Status.PASS, "Adactin logo is available");
    	File screenShotAs= logo.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(screenShotAs, new File("logo.png"));
			test.addScreenCaptureFromPath("logo.png");
		}
    	else {
			test.log(Status.FAIL, "Logo unavailable");
		}
}
    @Test
    private void Testing1() {
    	test=reports.createTest("Enter Uname and pass");
    	WebElement txtName = driver.findElement(By.id("username"));
    	test.log(Status.INFO, "Validate UName");
    	if (txtName.isEnabled() && txtName.isDisplayed()) {
			txtName.sendKeys("karthi007");
			
		}
    	else {
			test.log(Status.FAIL, "Username field is not enabled");
			
		}
    	test.log(Status.INFO, "Validate Password");
    	WebElement txtpass = driver.findElement(By.id("password"));
    	if (txtpass.isEnabled()&& txtpass.isDisplayed()) {
			txtpass.sendKeys("Karthi@1989");
		}
    	else {
			test.log(Status.FAIL, "Password field is not enabled");
		}
}
    @Test
    private void Testing2() {
    	test=reports.createTest("Click login button");
    	WebElement btnlogin = driver.findElement(By.id("login"));
    	test.log(Status.INFO, "Validate click");
    	if (btnlogin.isEnabled()&& btnlogin.isDisplayed()) {
			btnlogin.click();
		}
    	else {
			test.log(Status.FAIL, "Login  button not enabled");
		}
}
    @Test
    private void Testing3() {
        test=reports.createTest("Enter hotel details");
        WebElement txtlocation = driver.findElement(By.id("location"));
        selectByVisibleText(txtlocation, "Melbourne");
        test.log(Status.INFO, "Validate location");
        if (txtlocation.isEnabled()&& txtlocation.isDisplayed()) {
		}
        else {
			test.log(Status.FAIL, "Location not found");
		}
        WebElement txthotels = driver.findElement(By.id("hotels"));
        selectByVisibleText(txthotels, "Hotel Hervey");
        test.log(Status.INFO, "Validate hotels");
        if (txthotels.isEnabled()&& txthotels.isDisplayed()) {
		}
        else {
			test.log(Status.FAIL, "Hotel not found");
		}
        WebElement txtroom = driver.findElement(By.id("room_type"));
        selectByVisibleText(txtroom, "Super Deluxe");
        test.log(Status.INFO, "Validate rooms");
        if (txtroom.isEnabled()&& txtroom.isDisplayed()) {
		}
        else {
			test.log(Status.FAIL, "Rooms not found");
		}
        WebElement btnsearch = driver.findElement(By.id("Submit"));
        test.log(Status.INFO, "Validate search");
        if (btnsearch.isEnabled()&& btnsearch.isDisplayed()) {
        	btnsearch.click();
		}
        else {
			test.log(Status.FAIL, "Search button not enabled");
		}
	}
    @Test
    private void Testing4() throws InterruptedException {
    	test=reports.createTest("Select Hotel");
    	Thread.sleep(3000);
    	WebElement btnsearch = driver.findElement(By.id("radiobutton_0"));
    	test.log(Status.INFO, "Validating search");
    	if (btnsearch.isEnabled()&& btnsearch.isDisplayed()) {
    		btnsearch.click();
}
    	else {
			test.log(Status.FAIL, "Radio button not enabled");
		}
    	WebElement btncontinue = driver.findElement(By.id("continue"));
    	test.log(Status.INFO, "Validating continue button");
    	if (btncontinue.isEnabled()&& btncontinue.isDisplayed()) {
			btncontinue.click();
		}
    	else {
			test.log(Status.FAIL, "Continue button not enabled");
		}
	}
    @Test
    private void Testing5() throws InterruptedException {
    	test=reports.createTest("Book Hotel");
    	Thread.sleep(3000);
    	WebElement txtfname = driver.findElement(By.id("first_name"));
    	test.log(Status.INFO, "Validating Fname");
    	if (txtfname.isEnabled()&& txtfname.isDisplayed()) {
    		txtfname.sendKeys("Victor");
}
    	else {
			test.log(Status.FAIL, "First name is not validated");
		}
    	WebElement txtlname = driver.findElement(By.id("last_name"));
    	test.log(Status.INFO, "Validating Lname");
    	if (txtlname.isEnabled()&& txtlname.isDisplayed()) {
    		txtlname.sendKeys("duke");
}
    	else {
			test.log(Status.FAIL, "Last name is not validated");
    }
       	WebElement txtaddress = driver.findElement(By.id("address"));
    	test.log(Status.INFO, "Validating address");
    	if (txtaddress.isEnabled()&& txtaddress.isDisplayed()) {
    		txtaddress.sendKeys("10, Brooks street, Brimingham, U.K");
}
    	else {
			test.log(Status.FAIL, "Address is not entered");
    }
    	WebElement txtcc = driver.findElement(By.id("cc_num"));
    	test.log(Status.INFO, "Validating Credit card");
    	if (txtcc.isEnabled()&& txtcc.isDisplayed()) {
    		txtcc.sendKeys("9876543217890987");
}
    	else {
			test.log(Status.FAIL, "Credit card number not valid");
    }
       	WebElement txtcctype = driver.findElement(By.id("cc_type"));
    	test.log(Status.INFO, "Validating Credit card type");
    	if (txtcctype.isEnabled()&& txtcctype.isDisplayed()) {
    		selectByVisibleText(txtcctype, "Master Card");
}
    	else {
			test.log(Status.FAIL, "Credit card type is not valid");
    }
    	WebElement txtexpm = driver.findElement(By.id("cc_exp_month"));
    	test.log(Status.INFO, "Validating Credit card expiry month");
    	if (txtexpm.isEnabled()&& txtexpm.isDisplayed()) {
    		selectByVisibleText(txtexpm, "November");
}
    	else {
			test.log(Status.FAIL, "Credit card expiry month is not valid");
    }
    	WebElement txtexpy = driver.findElement(By.id("cc_exp_year"));
    	test.log(Status.INFO, "Validating Credit card expiry year");
    	if (txtexpy.isEnabled()&& txtexpy.isDisplayed()) {
    		selectByVisibleText(txtexpy, "2020");
}
    	else {
			test.log(Status.FAIL, "Credit card expiry year is not valid");
    }
    	WebElement txtccv = driver.findElement(By.id("cc_cvv"));
    	test.log(Status.INFO, "Validating Credit card ccv");
    	if (txtccv.isEnabled()&& txtccv.isDisplayed()) {
    		txtccv.sendKeys("323");
}
    	else {
			test.log(Status.FAIL, "Credit card ccv is not valid");
    }
       	WebElement btnbook = driver.findElement(By.id("book_now"));
    	test.log(Status.INFO, "Validating book now");
    	if (btnbook.isEnabled()&& btnbook.isDisplayed()) {
    		btnbook.click();
}
    	else {
			test.log(Status.FAIL, "Book not button is not valid");
    }
    }
    	@Test
    	private void Testing6() throws InterruptedException {
    		Thread.sleep(7000);
    		WebElement txtorder = driver.findElement(By.id("order_no"));	
        	String name=txtorder.getAttribute("value");	
        		System.out.println("Order number is: "+name);
}
    	
    
    
    @AfterClass
    private void afterClass() {
    	reports.flush();
}
}	
	













