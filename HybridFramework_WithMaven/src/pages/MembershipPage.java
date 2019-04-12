package pages;

import utility.CommonMethods;
import utility.ExcelReadWrite;

public class MembershipPage {

	public static void cartValue(String locatorVariable) throws Exception {
		String cartValue = CommonMethods.fetchValue(locatorVariable);
		ExcelReadWrite.writeValues("TestData", 5, 4, cartValue);
		System.out.println(cartValue);
	}
	
	public static void joinNowButton(String locatorVariable) {
		CommonMethods.handlingClick(locatorVariable);
	}
}
