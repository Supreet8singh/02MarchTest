package mainScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constantValues.ConstantVariable;
import testcases.TC001;
import testcases.TC002;
import testcases.TC003;
import testcases.TC004;
import utility.ExcelReadWrite;
import utility.Log;

public class DriverScript {
	
	public static boolean bValue;
	
	@BeforeClass
	public static void preRequiste() throws Exception {
		
		ExcelReadWrite.openExcel(ConstantVariable.excelPath);
		DOMConfigurator.configure("log4j.xml");
	}
	
	@Test(priority = 1)
	public static void tc01() throws Exception {
//-----------------------------TC001---------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 1, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC001");
			Reporter.log("TC001");
			TC001.tc01();			
			Log.endTestCase();
			Reporter.log("END");
		if (bValue == false) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 1, ConstantVariable.status, "FAIL");
		} 
		else if (bValue == true) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 1, ConstantVariable.status, "PASS");
		}
		} 
		else {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 1, ConstantVariable.status, "SKIP");
		}
//-------------------------------------------------------------------------------------------
	}
	
	@Test(priority = 2)
	public static void tc02() throws Exception {
//-----------------------------TC002--------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 2, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC002");
			Reporter.log("TC002");
			TC002.tc02();			
			Log.endTestCase();
			Reporter.log("END");
		if (bValue == false) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 2, ConstantVariable.status, "FAIL");
		} 
		else if (bValue == true) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 2, ConstantVariable.status, "PASS");
		}
		} 
		else {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 2, ConstantVariable.status, "SKIP");
		}
//-------------------------------------------------------------------------------------------
	}
	
	@Test(priority = 3)
	public static void tc03() throws Exception {
//-----------------------------TC003---------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 3, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC003");
			Reporter.log("TC003");
			TC003.tc03();			
			Log.endTestCase();
			Reporter.log("END");
		if (bValue == false) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 3, ConstantVariable.status, "FAIL");
		} 
		else if (bValue == true) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 3, ConstantVariable.status, "PASS");
		}
		} 
		else {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 3, ConstantVariable.status, "SKIP");
		}
//-------------------------------------------------------------------------------------------
	}
	
	@Test(priority = 4)
	public static void tc04() throws Exception {
//-----------------------------TC004---------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 4, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC004");
			Reporter.log("TC004");
			TC004.tc04();			
			Log.endTestCase();
			Reporter.log("END");
		if (bValue == false) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 4, ConstantVariable.status, "FAIL");
		} 
		else if (bValue == true) {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 4, ConstantVariable.status, "PASS");
		}
		} 
		else {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 4, ConstantVariable.status, "SKIP");
		}
//---------------------------------------------------------------------------------------------
	}
	}
