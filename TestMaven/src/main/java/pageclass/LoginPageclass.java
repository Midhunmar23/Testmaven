package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageclass 
{
	
	  public WebDriver driver;
	  
	  @FindBy(xpath="//input[@id='username']")WebElement usernamelogin;
	  @FindBy(xpath="//input[@id='password']")WebElement passwordlogin;
	  @FindBy(xpath="//button[@id='submit']") WebElement submitbuttonlogin;
	  
	   
	     public LoginPageclass(WebDriver driver)
	     {
	    	 this.driver= driver;
	    	 PageFactory.initElements( driver, this);
	     }
	     
	     
	       public void usernamelogin(String username)
	       {
	    	   this.usernamelogin.sendKeys(username);
	       }
	       public void usernamelogintwo(String username)
	       {
	    	   this.usernamelogin.sendKeys(username);
	       }
	       
	       
	       public void passwordLogin(String password)
	       {
	    	   this.passwordlogin.sendKeys(password);
	       }
	       
	       public void submitbuttonlogin()
	       {
	    	   submitbuttonlogin.click();
	       }
	       

}
