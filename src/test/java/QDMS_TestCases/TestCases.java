package QDMS_TestCases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import QDMS_Base.Base;
import QDMS_Pages.QDMDS_LoginPages;


public class TestCases extends Base{
	
	QDMDS_LoginPages Login= new QDMDS_LoginPages();
	
	@Test
public void Login_Functionality() throws InterruptedException {
		
		PageFactory.initElements(driver, Login);
		
		 FileInputStream file = new FileInputStream("C:\\Users\\sgic\\Documents\\AutomationWorkspace\\QDMS\\src\\test\\java\\Excel\\QDMS.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheet("Login");
         
         int rowcount = sheet.getLastRowNum();
         for(int i=0; i<=rowcount;i++) {        
       XSSFRow row = sheet.getRow(i);    
     
             String uName = (String)row.getCell(0).getStringCellValue();
             String pWord = (String)row.getCell(1).getStringCellValue();
		
		Thread.sleep(2000);
		
		QDMDS_LoginPages.UserName.sendKeys("admin");
		
		QDMDS_LoginPages.Password.sendKeys("tokyo@admin");
		
		QDMDS_LoginPages.Signin.click();
		
		
		
			
}
	}}
