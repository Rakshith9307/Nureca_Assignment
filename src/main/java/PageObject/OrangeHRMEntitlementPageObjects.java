package PageObject;

public class OrangeHRMEntitlementPageObjects {
	public static String employeeTextbox = "//input[@id='entitlements_employee_empName']";
	public static String leaveTypeDrodown = "//select[@id='entitlements_leave_type']";
	public static String leavePeriodDropdown = "//select[@id='period']";
	public static String entitlementTextbox = "//input[@id='entitlements_entitlement']";
	public static String saveButton = "//input[@id='btnSave']";
	public static String addedLink = "//td[contains(text(),'Added')]";
	public static String employeeNname = "//strong[contains(text(),'%replace%s')]";
	public static String confirmButton = "//input[@id='dialogUpdateEntitlementConfirmBtn']";	
	
	public static String getEmployeeName(String runTimePackageName) {
		String value = employeeNname;
		String value2;
		value2 = value.replace("%replace%s", runTimePackageName);
		return value2;
	}
	

}
