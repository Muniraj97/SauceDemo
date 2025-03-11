package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.SeleniumBaseClass;

public class CheckOutInformation extends SeleniumBaseClass {
public CheckOutInformation() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@id='first-name']")
private WebElement firstName;
public WebElement getFirstName() {
	return firstName;
}
@FindBy(xpath="//input[@id='last-name']")
private WebElement lastName;
public WebElement getLastName() {
	return lastName;
}
@FindBy(xpath="//input[@id='postal-code']")
private WebElement postalCode;
public WebElement getPostalCode() {
	return postalCode;
}
@FindBy(xpath="//input[@type='submit']")
private WebElement clickContinue;
public WebElement getClickContinue() {
	return clickContinue;
}
@FindBy(xpath="//div[text()='Checkout: Overview']")
private WebElement checkoutOverView;
public WebElement getCheckoutOverView() {
	return checkoutOverView;
}
@FindBy(xpath="//a[@class='btn_action cart_button']")
private WebElement clickFinshButton;
public WebElement getClickFinshButton() {
	return clickFinshButton;
}
@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
private WebElement orderConforamtionPage;
public WebElement getOrderConforamtionPage() {
	return orderConforamtionPage;
}
@FindBy(xpath="//button[text()='Open Menu']")
private WebElement clickMenuPage;
public WebElement getClickMenuPage() {
	return clickMenuPage;
}
@FindBy(xpath="//a[@id='logout_sidebar_link']")
private WebElement logoutPage;
public WebElement getLogoutPage() {
	return logoutPage;
}
}


