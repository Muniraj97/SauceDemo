package org.excution;


import org.openqa.selenium.WebElement;
import org.page.CheckOutInformation;
import org.page.TestScript;
import org.test.SeleniumBaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TC02_Saucedemo extends SeleniumBaseClass {
	public static SeleniumBaseClass seleniumBase=new SeleniumBaseClass();
	public static CheckOutInformation information;
	public static TestScript login=new TestScript();


@Test
public void ContinuePage() {
	information=new CheckOutInformation();
	WebElement clickContinue = information.getClickContinue();
    seleniumBase.SeleniumByJavaA(clickContinue);
    seleniumBase.waits();
    WebElement checkoutOverView = information.getCheckoutOverView();
    seleniumBase.validatePage(checkoutOverView,"Checkout: Overview");
    WebElement clickFinshButton = information.getClickFinshButton();
    seleniumBase.SeleniumByJavaA(clickFinshButton);
}
@AfterClass
public static void logoutPage() {
	information=new CheckOutInformation();
    WebElement orderConforamtionPage = information.getOrderConforamtionPage();
    seleniumBase.validatePage(orderConforamtionPage,"THANK YOU FOR YOUR ORDER");
    seleniumBase.navigate();
    WebElement clickMenuPage = information.getClickMenuPage();
    seleniumBase.SeleniumByJavaA(clickMenuPage);
    WebElement logoutPage = information.getLogoutPage();
    seleniumBase.validatePage(logoutPage,"Logout");
    seleniumBase.SeleniumByJavaA(logoutPage);
    seleniumBase.ClickDownPage();
    
}













}
