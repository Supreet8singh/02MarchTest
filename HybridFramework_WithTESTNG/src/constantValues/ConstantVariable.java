package constantValues;

import utility.ExcelReadWrite;

public class ConstantVariable {

	public final static String excelPath = "E:\\2MarchBatch\\HybridFramework_WithTESTNG\\Test.xlsx";
	public final static String testScenarioSheet = "TestScenario";
	public final static int runMode = 2;
	public final static int status = 3;
	public final static String browserName = ExcelReadWrite.readValues("TestData", 1, 3);
	public final static String url = ExcelReadWrite.readValues("TestData", 2, 3);
	public final static String firstName = ExcelReadWrite.readValues("TestData", 9, 3);
	public final static String lastName = ExcelReadWrite.readValues("TestData", 10, 3);
	public final static String userName = ExcelReadWrite.readValues("TestData", 11, 3);
	public final static String password = ExcelReadWrite.readValues("TestData", 12, 3);
	public final static String confirmPassword = ExcelReadWrite.readValues("TestData", 13, 3);
	public final static String emailId = ExcelReadWrite.readValues("TestData", 14, 3);
	public final static String companyName = ExcelReadWrite.readValues("TestData", 15, 3);
	public final static String streetName = ExcelReadWrite.readValues("TestData", 16, 3);
	public final static String cityName = ExcelReadWrite.readValues("TestData", 17, 3);
	public final static String phoneNumber = ExcelReadWrite.readValues("TestData", 19, 3);
	public final static String countryName = ExcelReadWrite.readValues("TestData", 20, 3);
	public final static String stateName = ExcelReadWrite.readValues("TestData", 21, 3);
	public final static String zipCode = ExcelReadWrite.readValues("TestData", 18, 3);

}
