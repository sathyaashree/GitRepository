package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HotelDetails extends BaseClass {

	public static void main(String[] args) {
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		LoginPage login=new LoginPage();
		login.getTxtname().sendKeys("karthi007");
		login.getTxtpass().sendKeys("Karthi@1989");
		login.getBtnLogin().click();
		SearchHotelPOM search =new SearchHotelPOM();
		WebElement txtlocation = search.getTxtlocation();
		search.selectByVisibleText(txtlocation, "Melbourne");
		WebElement txthotel = search.getTxthotel();
		search.selectByVisibleText(txthotel, "Hotel Sunshine");
		WebElement txtroom = search.getTxtroom();
		search.selectByVisibleText(txtroom, "Super Deluxe");
		search.getBtnSearch().click();
		SelectHotelPOM select=new SelectHotelPOM();
		select.getBtnselect().click();
		select.getBtncontinue().click();
		BookHotelPOM book=new BookHotelPOM();
		book.getTxtfname().sendKeys("Mario");
		book.getTxtlname().sendKeys("Chan");
		book.getTxtaddress().sendKeys("99, Harrington street, Los Vegas");
		book.getTxtcc().sendKeys("1234678906543212");
		WebElement txtctype = book.getTxtctype();
		book.selectByVisibleText(txtctype, "Master Card");
		WebElement txtexpm = book.getTxtexpm();
		book.selectByVisibleText(txtexpm, "November");
		WebElement txtexpy = book.getTxtexpy();
		book.selectByVisibleText(txtexpy, "2020");
		book.getTxtccv().sendKeys("311");
		book.getBtnclick().click();
		}
		}








