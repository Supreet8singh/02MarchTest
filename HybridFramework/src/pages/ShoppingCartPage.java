package pages;

import utility.CommonMethods;
import utility.ExcelReadWrite;

public class ShoppingCartPage {

	public static void totalPriceshoppingcart(String locatorVariable) throws Exception {
		String totalPriceshoppingcart = CommonMethods.fetchValue(locatorVariable);
		ExcelReadWrite.writeValues("TestData", 7, 4, totalPriceshoppingcart);
		System.out.println(totalPriceshoppingcart);
	}
	
	public static void createanaccount(String locatorVariable) {
		CommonMethods.handlingClick(locatorVariable);	
	}
}
