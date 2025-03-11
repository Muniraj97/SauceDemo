package org.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.SeleniumBaseClass;

public class TestScript  extends SeleniumBaseClass{
public TestScript() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@id='user-name']")
private WebElement userName;
public WebElement getUserName() {
	return userName;
}
@FindBy(xpath="//input[@id='password']")
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(xpath="//input[@id='login-button']")
private WebElement loginPage;
public WebElement getLoginPage() {
	return loginPage;
}
@FindBy(xpath="(//button[@class='btn_primary btn_inventory'])[1]")
private WebElement AddCart;
public WebElement getAddCart() {
	return AddCart;
}

@FindBy(xpath="//span[@class='fa-layers-counter shopping_cart_badge']")
private WebElement clickAddCart;
public WebElement getClickAddCart() {
	return clickAddCart;
}
@FindBy(xpath="//div[text()='Your Cart']")
private WebElement validateAddRecently;
public WebElement getValidateAddRecently() {
	return validateAddRecently;
}
@FindBy(xpath="//a[text()='CHECKOUT']")
private WebElement ClickCheckOut;
public WebElement getClickCheckOut() {
	return ClickCheckOut;
}
@FindBy(xpath="//div[@class='subheader']")
private WebElement valiDateCheckOut;
public WebElement getValiDateCheckOut() {
	return valiDateCheckOut;
}

}

