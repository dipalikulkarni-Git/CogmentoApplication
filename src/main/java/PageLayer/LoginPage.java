package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass { 
	
	//create object repository by using page model object with Page Factory
	
	@FindBy(name="email")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement login;
	
	//initilization object repository by using PageFactory dot initElements() method in cunstructor
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//created non static associated methods for each and every object repository without entering test data
	
	public void checkLoginFunctionality(String uname,String Password)
	
	{
		Wait.sendkeys(user, uname);
		Wait.sendkeys(pass, Password);
	}
		
		public void clickonloginbutton() {
			Wait.click(login);
		}
		
		
	}



