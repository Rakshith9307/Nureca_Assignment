package TestScripts;
import java.io.IOException;

import org.testng.annotations.Test;

import Components.*;

public class OrangeHRM extends DriverBrowser{
	
	/**********************************************************************************************************
	 *@Purpose: 1. Add leave Entitlement - Select any employee, select leave type FMLA and add leave
					entitlement
				2. Assign Leave - Assign leave for the employee with a RANDOM leave type
				3. Leave List - Cancel the leave request if there is no sufficient leave balance.				
	 *@author:Rakshith M
	 * @throws IOException 
	 *@Date :22-July-2021
	 *@Updated by and when:
	 **********************************************************************************************************/

	@Test(testName = "TC-001-Login to LSRIMS application", description = "Login to LSRIMS application", priority = 0)
	public static void Login() throws IOException {
		Login.applicationLogin(CommonModule.readExcel("OrangeHRMLogin", 1, 1),CommonModule.readExcel("OrangeHRMLogin", 1, 2),CommonModule.readExcel("OrangeHRMLogin", 1, 3));
	}

	@Test(testName = "TC-002-Add Entetlements", description = "Select any employee, select leave type FMLA and add leave entitlement", priority = 1)
	public void AddEntitlements() throws IOException {
		HomePage.Navigatiton("Entitlements"); 
		OrangeHRMEntitlements.addLeaveEntitlement(CommonModule.readExcel("OrangeHRMEntitlements", 1, 1),CommonModule.readExcel("OrangeHRMEntitlements", 1, 2),CommonModule.readExcel("OrangeHRMEntitlements", 1, 3),CommonModule.readExcel("OrangeHRMEntitlements", 1, 4));
	}

	@Test(testName = "TC-003-Assign Leave", description = "Assign leave for the employee with a RANDOM leave type", priority = 2)
	public void AssigneLeave() throws IOException {
		HomePage.Navigatiton("Assign Leave"); 
		OrangeHRMAssignLeave.assgnLeave(CommonModule.readExcel("OrangeHRMAssignLeave", 1, 1),CommonModule.readExcel("OrangeHRMAssignLeave", 1, 2),CommonModule.readExcel("OrangeHRMAssignLeave", 1, 3),CommonModule.readExcel("OrangeHRMAssignLeave", 1, 4),CommonModule.readExcel("OrangeHRMAssignLeave", 1, 5));
	}

	@Test(testName = "TC-004-Leave List", description = "Cancel the leave request if there is no sufficient leave balance.", priority = 3)
	public void LeaveList() throws IOException {
		HomePage.Navigatiton("Leave List");
		OrangeHRMLeaveList.cancelLeave(CommonModule.readExcel("OrangeHRMLeaveList", 1, 1),CommonModule.readExcel("OrangeHRMLeaveList", 1, 2));
	}
	@Test(testName = "TC-005-Logout", description = "Logout From application", priority = 4)
	public void Logout() {
		HomePage.Logout();
	}
}
