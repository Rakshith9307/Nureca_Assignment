package Components;

import org.openqa.selenium.By;

import PageObject.OrangeHRMHomePageObjects;

public class HomePage extends CommonModule{
	
	/**********************************************************************************************************
     *@Objective:This method is created to Logout from Application.
     *@Input Parameters: Scenario Name
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void Logout() {
		click(OrangeHRMHomePageObjects.homePage);
		sleep();
		click(OrangeHRMHomePageObjects.logoutLink);
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to Navigate from One menu to Other.
     *@Input Parameters: Scenario Name
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void Navigatiton(String Select) {
		if ("Entitlements".equals(Select)) {
			click(OrangeHRMHomePageObjects.leaveMenu);
			movetoelement(driver.findElement(By.xpath("//a[@id='menu_leave_Entitlements']")));
			click(OrangeHRMHomePageObjects.addentitlementsLink);
		} else if ("Leave List".equals(Select)) {
			click(OrangeHRMHomePageObjects.leaveMenu);
			click(OrangeHRMHomePageObjects.leaveListLink);
		} else if ("Assign Leave".equals(Select)) {
			click(OrangeHRMHomePageObjects.leaveMenu);
			click(OrangeHRMHomePageObjects.assignLeaveLink);
		}
	}

}
