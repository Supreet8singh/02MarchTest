package mainScript;

import org.apache.log4j.xml.DOMConfigurator;

import constantValues.ConstantVariable;
import testcases.TC001;
import testcases.TC002;
import testcases.TC003;
import testcases.TC004;
import utility.ExcelReadWrite;
import utility.Log;

public class DriverScript {
	
	public static boolean bValue;
	
	public static void main(String[] args) throws Exception {
		
		ExcelReadWrite.openExcel(ConstantVariable.excelPath);
		DOMConfigurator.configure("log4j.xml");

//-----------------------------TC001---------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 1, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC001");
			TC001.tc01();			
			Log.endTestCase();
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
//-----------------------------TC002--------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 2, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC002");
			TC002.tc02();			
			Log.endTestCase();
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
//-----------------------------TC003---------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 3, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC003");
			TC003.tc03();			
			Log.endTestCase();
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
//-----------------------------TC004---------------------------------------------------------		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 4, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			bValue = true;
			Log.startTestCase("TC004");
			TC004.tc04();			
			Log.endTestCase();
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