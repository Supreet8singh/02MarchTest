package constantValues;

import utility.ExcelReadWrite;

public class ConstantVariable {

	public final static String excelPath = "E:\\2MarchBatch\\DataDrivenFramework\\Test.xlsx";

//	public static String browserName = "Chrome";
//	public static String url = "https://www.aapc.com/";
//	public static String firstName = "TestUser";
//	public static String lastName = "TestLastName";
//	public static String userName = "Testfirstlast";
//	public static String password = "Test@234";
//	public static String confirmPassword = "Test@234";
//	public static String emailId = "TestUser@te.com";
//	public static String companyName = "Test company";
//	public static String streetName = "Test street";
//	public static String cityName = "Salt lake city";
//	public static String phoneNumber = "12346546";
//	public static String countryName = "United States";
//	public static String stateName = "UT";
//	public static String zipCode = "84120";

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
