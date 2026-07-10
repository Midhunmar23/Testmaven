package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pageclass.LoginPageclass;
import utility.Excelutility;

public class LoginTest  extends Base
{
	
	 
	
	   @Test
	   public void verifyThatTheUserShoudAbleToLoginWithValidUserCreditials() throws IOException
	   {
		   
		  
		   String username= Excelutility.getStringData(1, 0, "Loginuser");
		   String password=Excelutility.getStringData(1, 1, "Loginuser");
		   LoginPageclass  loginpageclass = new LoginPageclass(driver);
		   loginpageclass.usernamelogin(username);
		   loginpageclass.passwordLogin(password);
		   loginpageclass.submitbuttonlogin();
		   
	   }

}
