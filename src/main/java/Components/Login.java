package Components;

import PageObject.OrangeHRMHomePageObjects;
import PageObject.OrangeHRMLoginPageObjects;

public class Login extends CommonModule{
	
	/**********************************************************************************************************
     *@Objective:This method is created to Login to Application.
     *@Input Parameters: Scenario Name
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/
	
	public static void applicationLogin(String url,String userName,String pwd) {
		navigateURL(url);
		sendKeys(OrangeHRMLoginPageObjects.userNameTextbox, userName);
		sendKeys(OrangeHRMLoginPageObjects.passwordTextbox, pwd);
		click(OrangeHRMLoginPageObjects.loginButton);
		sleep();
		assertVisible(OrangeHRMHomePageObjects.homePage);
		takeScreenShot();
	}

}
