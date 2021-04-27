package org.sample;

public class AdactinPOM extends BaseClass {
public static void main(String[] args) {
getDriver();
launchUrl("https://adactinhotelapp.com/");
LoginPage login=new LoginPage();
login.getTxtname().sendKeys("karthi007");
login.getTxtpass().sendKeys("Karthi@1989");
login.getBtnLogin().click();
}
}
