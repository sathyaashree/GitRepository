package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPOM extends BaseClass{
	public BookHotelPOM() {
		PageFactory.initElements(driver, this);
		}
		@FindBy(id="first_name")
		private WebElement txtfname;

		@FindBy(id="last_name")
		private WebElement txtlname;

		@FindBy(xpath="//textarea[@id='address']")
		private WebElement txtaddress;
		
		@FindBy(id="cc_num")
		private WebElement txtcc;

		@FindBy(id="cc_type")
		private WebElement txtctype;
		
		@FindBy(id="cc_exp_month")
		private WebElement txtexpm;
		
		@FindBy(id="cc_exp_year")
		private WebElement txtexpy;
		
		@FindBy(id="cc_cvv")
		private WebElement txtccv;
		
		@FindBy(id="book_now")
		private WebElement btnclick;
		

		public WebElement getTxtfname() {
			return txtfname;
		}

		public WebElement getTxtlname() {
			return txtlname;
		}

		public WebElement getTxtaddress() {
			return txtaddress;
		}

		public WebElement getTxtcc() {
			return txtcc;
		}

		public WebElement getTxtctype() {
			return txtctype;
		}

		public WebElement getTxtexpm() {
			return txtexpm;
		}

		public WebElement getTxtexpy() {
			return txtexpy;
		}

		public WebElement getTxtccv() {
			return txtccv;
			
		}

		public WebElement getBtnclick() {
			return btnclick;
		}


		}
		
		
