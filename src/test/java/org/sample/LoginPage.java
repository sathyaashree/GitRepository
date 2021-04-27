package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
public LoginPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement txtname;

@FindBy(name="password")
private WebElement txtpass;

@FindBy(xpath="//input[@id='login']")
private WebElement btnLogin;

public WebElement getTxtname() {
	return txtname;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}


}
