package mainScript;

import org.apache.log4j.xml.DOMConfigurator;

import constantValues.ConstantVariable;
import testcases.TC001;
import testcases.TC002;
import testcases.TC003;
import utility.ExcelReadWrite;
import utility.Log;

public class DriverScript {
	
	public static void main(String[] args) throws Exception {
		
		ExcelReadWrite.openExcel(ConstantVariable.excelPath);
		DOMConfigurator.configure("log4j.xml");
		
		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 1, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			Log.startTestCase("TC001");
			TC001.tc01();			
			Log.endTestCase();
		} else {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 1, ConstantVariable.status, "SKIP");
		}

		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 2, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			Log.startTestCase("TC002");
			TC002.tc02();
			Log.endTestCase();
		} else {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 2, ConstantVariable.status, "SKIP");
		}

		if (ExcelReadWrite.readValues(ConstantVariable.testScenarioSheet, 3, ConstantVariable.runMode).equalsIgnoreCase("Y")) {
			Log.startTestCase("TC003");
			TC003.tc03();
			Log.endTestCase();
		} else {
			ExcelReadWrite.writeValues(ConstantVariable.testScenarioSheet, 3, ConstantVariable.status, "SKIP");
		}
	}		
}
