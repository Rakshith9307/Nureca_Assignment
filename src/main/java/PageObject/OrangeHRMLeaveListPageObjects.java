package PageObject;

public class OrangeHRMLeaveListPageObjects {
	public static String employeeTextbox = "//input[@id='leaveList_txtEmployee_empName']";
	public static String pendingApprovalCheckBox = "//label[@for='leaveList_chkSearchFilter_3'][contains(text(),'Taken')]";
	public static String scheduledApprovalCheckBox = "//label[@for='leaveList_chkSearchFilter_checkboxgroup_allcheck'][contains(text(),'All')]";
	public static String searchButton = "//input[@id='btnSearch']";
	public static String actionDropDown = "//tr[1]//select[@class='select_action quotaSelect']";
	public static String saveButton = "//input[@id='btnSave']";
	public static String leavebalance="//tr[1]//td[4][@class='right']";
	public static String noRecordsFoundLable="//td[text()='No Records Found']";

}
