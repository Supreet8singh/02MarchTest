package testcases;

import constantValues.ConstantVariable;
import constantValues.LocatorConstants;
import pages.AddressbookPage;

public class TC003 {

	public static void tc03() {
		
	AddressbookPage.firstName(LocatorConstants.enterfirstName_AddressbookPage , ConstantVariable.firstName);
	AddressbookPage.lastName(LocatorConstants.enterlastName_AddressbookPage , ConstantVariable.lastName);
	AddressbookPage.userName(LocatorConstants.enteruserName_AddressbookPage , ConstantVariable.userName);
	AddressbookPage.password(LocatorConstants.enterpassword_AddressbookPage , ConstantVariable.password);
	AddressbookPage.confirmPassword(LocatorConstants.enterconfirmpassword_AddressbookPage , ConstantVariable.confirmPassword);
	AddressbookPage.emailId(LocatorConstants.enterEmailid_AddressbookPage , ConstantVariable.emailId);
	AddressbookPage.companyName(LocatorConstants.entercompanyname_AddressbookPage , ConstantVariable.companyName);
	AddressbookPage.streetName(LocatorConstants.enterStreetName_AddressbookPage , ConstantVariable.streetName);
	AddressbookPage.cityName(LocatorConstants.enterCityName_AddressbookPage , ConstantVariable.cityName);
	AddressbookPage.stateName(LocatorConstants.enterState_AddressbookPage , ConstantVariable.stateName);
	AddressbookPage.countryName(LocatorConstants.enterCountry_AddressbookPage , ConstantVariable.countryName);
	AddressbookPage.phoneNumber(LocatorConstants.enterPhone_AddressbookPage , ConstantVariable.phoneNumber);
	AddressbookPage.zipCode(LocatorConstants.enterZipcode_AddressbookPage , ConstantVariable.zipCode);
	
	}
}
