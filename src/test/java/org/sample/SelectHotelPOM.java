package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPOM extends BaseClass {

	public SelectHotelPOM() {
		PageFactory.initElements(driver, this);
		}
		@FindBy(id="radiobutton_0")
		private WebElement btnselect;

		@FindBy(id="continue")
		private WebElement btncontinue;

		public WebElement getBtnselect() {
			return btnselect;
		}

		public WebElement getBtncontinue() {
			return btncontinue;
		}


}
