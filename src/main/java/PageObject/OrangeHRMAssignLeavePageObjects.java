package PageObject;

public class OrangeHRMAssignLeavePageObjects {
	public static String employeeNameTextbox = "//input[@id='assignleave_txtEmployee_empName']";
	public static String leaveTypeDropdown = "//select[@id='assignleave_txtLeaveType']";
	public static String fromDate = "//input[@id='assignleave_txtFromDate']";
	public static String toDate = "//input[@id='assignleave_txtToDate']";
	public static String commentsTextarea = "//textarea[@id='assignleave_txtComment']";
	public static String leavebalanceLink = "//div[@id='assignleave_leaveBalance']";
	public static String assignButton = "//input[@id='assignBtn']";
	public static String confirmationMessage = "//p[contains(text(),'Employee does not have sufficient leave balance for leave request.')]";
	public static String assignOkButton = "//input[@id='confirmOkButton']";

}
