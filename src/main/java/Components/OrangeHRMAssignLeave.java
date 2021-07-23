package Components;

import PageObject.*;;

public class OrangeHRMAssignLeave extends CommonModule{
	
	/**********************************************************************************************************
     *@Objective:This method is created to Assign Leave.
     *@Input Parameters: Scenario Name
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void assgnLeave(String EmployeeName,String LeaveType,String FromDate,String ToDate,String Comments) {
		sendKeys(OrangeHRMAssignLeavePageObjects.employeeNameTextbox, EmployeeName);
		//click(OrangeHRMEntitlementPageObjects.getEmployeeName(EmployeeName));
		selectValue(OrangeHRMAssignLeavePageObjects.leaveTypeDropdown, LeaveType);
		sendKeys(OrangeHRMAssignLeavePageObjects.fromDate, FromDate);
		sendKeys(OrangeHRMAssignLeavePageObjects.toDate,ToDate);
		sendKeys(OrangeHRMAssignLeavePageObjects.commentsTextarea, Comments);
		CommonModule.takeScreenShot();
		click(OrangeHRMAssignLeavePageObjects.assignButton);
		assertVisible(OrangeHRMAssignLeavePageObjects.confirmationMessage);
		CommonModule.takeScreenShot();
		sleep();
		click(OrangeHRMAssignLeavePageObjects.assignOkButton);
		CommonModule.takeScreenShot();
	}
	

}
