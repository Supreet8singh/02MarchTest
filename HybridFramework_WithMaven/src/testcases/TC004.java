package testcases;

import constantValues.LocatorConstants;
import pages.AddressbookPage;
import pages.CodeSearchPage;
import pages.TrialBuyPage;

public class TC004 {

	public static void tc04() {

		AddressbookPage.booksSoftwarehover(LocatorConstants.booksSoftwareLink_AddressbookPage);
		AddressbookPage.coderHoverandClick(LocatorConstants.aapcCoderLink_AddressbookPage);
		CodeSearchPage.clickSubscribeNowLink(LocatorConstants.subscribeNow_CoderSearchPage);
		TrialBuyPage.clickMonthlyubscription(LocatorConstants.monthlySub_TrialBuyPage);
		TrialBuyPage.clickTermsCondition(LocatorConstants.termsCondition_TrialBuyPage);
		TrialBuyPage.clickCheckOut(LocatorConstants.checkOut_TrialBuyPage);

	}
}
