package Components;

import PageObject.*;;


public class OrangeHRMLeaveList extends CommonModule{
	
	/**********************************************************************************************************
     *@Objective:This method is created to Cancel leave Applcation if Leave balance is not available.
     *@Input Parameters: Scenario Name
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-Feb-2020
     **********************************************************************************************************/

	public static void cancelLeave(String EmployeeName,String Action) {
		sleep();
		sendKeys(OrangeHRMLeaveListPageObjects.employeeTextbox, EmployeeName);
		click(OrangeHRMEntitlementPageObjects.getEmployeeName(EmployeeName));
		click(OrangeHRMLeaveListPageObjects.pendingApprovalCheckBox);
		//click(OrangeHRMLeaveListPageObjects.scheduledApprovalCheckBox);
		CommonModule.takeScreenShot();
		click(OrangeHRMLeaveListPageObjects.searchButton);
		if(getText(OrangeHRMLeaveListPageObjects.leavebalance).equalsIgnoreCase("0.00") || getText(OrangeHRMLeaveListPageObjects.leavebalance).contains("-")) {
			selectValue(OrangeHRMLeaveListPageObjects.actionDropDown, Action);
			CommonModule.takeScreenShot();
			click(OrangeHRMLeaveListPageObjects.saveButton);
		}
		//CommonModule.takeScreenShot();
		//assertVisible(OrangeHRMLeaveListPageObjects.noRecordsFoundLable);
		CommonModule.takeScreenShot();
	
	}

}
