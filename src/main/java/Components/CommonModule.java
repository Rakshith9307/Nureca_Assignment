package Components;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonModule extends DriverBrowser{
	public static long timeSeconds = 3000;
	public static long timeWait = 5000;
	public static long delayExcution = 2000;
	
	/**********************************************************************************************************
     *@Objective:This method is created to set the value
     *@Input Parameters:NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/
	public static void sendKeys(String locator,String value) {
		driver.findElement(By.xpath(locator)).clear();
		executionDeleay();
		driver.findElement(By.xpath(locator)).sendKeys(value);
		executionDeleay();
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to select the value from Dropdown
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void selectValue(String locator,String value) {
		Select se = new Select(driver.findElement(By.xpath(locator)));
		se.selectByVisibleText(value);
		executionDeleay();
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to click the element
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
		executionDeleay();
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to navigate from browser
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void navigateURL(String url) {
		driver.get(url);
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created return visible condition of element
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static boolean isVisible(String locator) {
		boolean status = driver.findElement(By.xpath(locator)).isDisplayed();
		return status;
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to wait for some time during execution
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void sleep() {
		try {
			Thread.sleep(timeSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to set time for execution delay
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	
	public static void executionDeleay() {
		try {
			Thread.sleep(delayExcution);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to wait tille element is visible
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	
	public static void waitTileVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(locator))));
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to verify the data
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void assertEqual(String expected,String locator) {
		String value= driver.findElement(By.xpath(locator)).getText();
		if(expected.equals(value)) {
			System.out.println("Expected and Actual Values are same");
		}
		else {
			System.out.println("Expected and Actual Values are different");
		}
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to fetching data from application
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static String getText(String locator) {
		String value= driver.findElement(By.xpath(locator)).getText();
		return value;
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to verify the element is visible or not
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void assertVisible(String locator) {
		boolean status = isVisible(locator);
		if(status == true) {
			System.out.println(locator +" : Element is visible");
		}
		else {
			System.out.println(locator+ " : Element is not visible");
		}
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created for Mouse over operation
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void movetoelement(WebElement element) {
		try {
			Actions act = new Actions(driver);
			Action mouseHover = act.moveToElement(element).build();
			mouseHover.perform();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();

		}
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to fetching the time stamp.
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to take screenshot
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void takeScreenShot() {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "\\src\\ScreenShot\\";
			FileUtils.copyFile(src, new File(path+ timestamp() + ".png"));
			System.out.println("Path for screenShot : "+path+"\\"+timestamp() + ".png");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to click the element using java script
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	public static void javascriptExecutorClick(String webElement) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", webElement);
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		}
	}
	
	/**********************************************************************************************************
     *@Objective:This method is created to reading data from excel file
     *@Input Parameters: NA
     *@Output Parameters: NA
     *@author: Rakshith M
     *@Date : 22-July-2021
     **********************************************************************************************************/

	
	public static String filePath = System.getProperty("user.dir") + "//src//main//java//TestData//";
	public static String fileName = "HRM_testData.xlsx";
    public static String readExcel(String sheetName,int rowNum,int colNum) throws IOException{
    	File file =    new File(filePath+"//"+fileName);
    	FileInputStream inputStream = new FileInputStream(file);
    	Workbook guru99Workbook = null;	
    	String fileExtensionName = fileName.substring(fileName.indexOf("."));
    	if(fileExtensionName.equals(".xlsx")){
    		guru99Workbook = new XSSFWorkbook(inputStream);
    	}
    	else if(fileExtensionName.equals(".xls")){
        guru99Workbook = new HSSFWorkbook(inputStream);
    	}
    	Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
    	int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
    	Row row = guru99Sheet.getRow(rowNum);
    	System.out.print(row.getCell(colNum).getStringCellValue()+"|| ");
    	return row.getCell(colNum).getStringCellValue();
     
    }
	

	
}
