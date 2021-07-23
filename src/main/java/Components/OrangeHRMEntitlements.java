package Components;

import PageObject.*;


public class OrangeHRMEntitlements extends CommonModule{

	
	/**********************************************************************************************************
     *@Objective:This method is created t0 Add Entitlement.
     *@Input Parameters: Scenario Name
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void addLeaveEntitlement(String emplyeeName,String LeaveType,String LeavePeriod,String Entitlement) {
		sendKeys(OrangeHRMEntitlementPageObjects.employeeTextbox,emplyeeName);
		click(OrangeHRMEntitlementPageObjects.getEmployeeName(emplyeeName));
		selectValue(OrangeHRMEntitlementPageObjects.leaveTypeDrodown, LeaveType);
		//selectValue(OrangeHRMEntitlementPageObjects.leavePeriodDropdown, LeavePeriod);
		sendKeys(OrangeHRMEntitlementPageObjects.entitlementTextbox, Entitlement);
		CommonModule.takeScreenShot();	
		sleep();
		click(OrangeHRMEntitlementPageObjects.saveButton);
		waitTileVisible(OrangeHRMEntitlementPageObjects.confirmButton);
		click(OrangeHRMEntitlementPageObjects.confirmButton);
		//assertVisible(OrangeHRMEntitlementPageObjects.addedLink);
		CommonModule.takeScreenShot();	
	}
	

}
