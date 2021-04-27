package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPOM extends BaseClass {
	public SearchHotelPOM() {
		PageFactory.initElements(driver, this);
		}
		@FindBy(id="location")
		private WebElement txtlocation;

		@FindBy(id="hotels")
		private WebElement txthotel;

		@FindBy(xpath="//select[@id='room_type']")
		private WebElement txtroom;
		
		@FindBy(id="Submit")
		private WebElement btnSearch;

		public WebElement getTxtlocation() {
			return txtlocation;
		}

		public WebElement getTxthotel() {
			return txthotel;
		}

		public WebElement getTxtroom() {
			return txtroom;
		}

		public WebElement getBtnSearch() {
			return btnSearch;
		}
		

}
