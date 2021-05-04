package com.qa.testscript;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class MultipleWindow  extends TestbaseSearch{
	@Test(dataProvider="getData")
	
	public void Bag (String Input)throws InterruptedException,IOException{
		driver.manage().window().maximize();
		MyntraOR.getsearchbar().sendKeys(Input);
		MyntraOR.getselect().click();
		MyntraOR.getshirt().click();///on click will open new window
			Set<String> windowHandles =driver.getWindowHandles();
		Iterator<String> iter =windowHandles.iterator();
		while(iter.hasNext()) {
			String winId =iter.next();
			WebDriver window =driver.switchTo().window(winId);
			Reporter.log(window.getTitle(),true);
		}
			
			MyntraOR.getsize().click();
			MyntraOR.getbag().click();
			Thread.sleep(5000);
			MyntraOR.getgotobag().click();
		
			MyntraOR.getplaceorder().click();
			 String pageTitle=driver.getTitle();
			 String Excepted= "Myntra";
				System.out.println(pageTitle);
		 if (pageTitle.equals(Excepted)) {
			 Reporter.log("User is able to place order");
		 }
		 else {
			 Reporter.log("User is  not able to place order");
		 }
		
	}
	@DataProvider
	public String[][]getData()throws IOException{
		String x1Path="C:\\Users\\HP\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\qa\\utility\\TestData2.xlsx";
		String x1Sheet="Sheet3";
		int rowCount=ExcelUtility.getRowCount(x1Path,x1Sheet);
		int cellCount=ExcelUtility.getCellCount(x1Path,x1Sheet,rowCount);
		String[][]data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for (int j=0;j<cellCount;j++) {
				data[i-1][j]=ExcelUtility.getCellData(x1Path,x1Sheet,i,j);
			}
		}
		return data;
				}

}
