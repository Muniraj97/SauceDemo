package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page.CheckOutInformation;
import org.page.TestScript;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseClass {
	public static SeleniumBaseClass seleniumBase=new SeleniumBaseClass();
	public static CheckOutInformation information;
	public static TestScript login=new TestScript();
	public static WebDriver driver;
	public void initCondition() {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	}
    @BeforeClass
    public static void BrowserUrlLaunch() {
    	seleniumBase.initCondition();
    	seleniumBase.launchUrl("https://www.saucedemo.com/v1/");
    	seleniumBase.maximize();
        login=new TestScript();
    	WebElement userName = login.getUserName();
        seleniumBase.SeleniumByJava(userName,"standard_user");
        WebElement password = login.getPassword();
        seleniumBase.SeleniumByJava(password,"secret_sauce");
        WebElement loginPage = login.getLoginPage();
        seleniumBase.SeleniumByJavaA(loginPage); 
        WebElement addCart = login.getAddCart();
        seleniumBase.SeleniumByJavaA(addCart);
        WebElement clickAddCart = login.getClickAddCart();
        seleniumBase.SeleniumByJavaA(clickAddCart);
        WebElement validateAddRecently = login.getValidateAddRecently();
        seleniumBase.validatePage(validateAddRecently,"Your Cart" );
        WebElement clickCheckOut = login.getClickCheckOut();
        seleniumBase.SeleniumByJavaA(clickCheckOut);
        WebElement valiDateCheckOut = login.getValiDateCheckOut();
        seleniumBase.validatePage(valiDateCheckOut,"Checkout: Your Information");
     
    	information=new CheckOutInformation();
    	WebElement firstName = information.getFirstName();
    	seleniumBase.SeleniumByJava(firstName,"muni");
    	WebElement lastName = information.getLastName();
    	seleniumBase.SeleniumByJava(lastName,"raj");
    	WebElement postalCode = information.getPostalCode();
    	seleniumBase.SeleniumByJava(postalCode,"543666");
        
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void SeleniumByJava(WebElement element,String key) {
		element.sendKeys(key);
	}
	public void SeleniumByJavaA(WebElement element) {
		element.click();
	}
	public void validatePage(WebElement element,String name) {
		element.isDisplayed();
		System.out.println(name);

	}
	public void navigate() {
		driver.navigate().refresh();
	}
	public void ClickDownPage() {
		try {
			Robot r=new Robot();
		
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			} catch (Exception e) {
		}
	}
	public void waits() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		
		}
	}
	public void maximize() {
		driver.manage().window().maximize();

	}

	}
	
	

	

	

	
	


