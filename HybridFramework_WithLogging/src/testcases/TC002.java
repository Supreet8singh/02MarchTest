package testcases;

import constantValues.LocatorConstants;
import pages.MembershipPage;
import pages.ShoppingCartPage;

public class TC002 {

	public static void tc02() throws Exception {

	MembershipPage.cartValue(LocatorConstants.cartValue_MembershipPage);
	MembershipPage.joinNowButton(LocatorConstants.joinNowButton_MembershipPage);
	ShoppingCartPage.totalPriceshoppingcart(LocatorConstants.totalPriceshoppingcart_ShoppingCartPage);
	ShoppingCartPage.createanaccount(LocatorConstants.createanaccount_ShoppingCartPage);
	}
}
