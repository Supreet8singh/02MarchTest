package testcases;

import constantValues.ConstantVariable;
import constantValues.LocatorConstants;
import pages.LandingPage;
import utility.CommonMethods;

public class TC001 {

	public static void tc01() {
		
		CommonMethods.browserName(ConstantVariable.browserName);
		CommonMethods.openUrl(ConstantVariable.url);
		LandingPage.membershiplink(LocatorConstants.membershiplink_LandingPage);
		LandingPage.individualLink(LocatorConstants.individualLink_LandingPage);		

	}

}
