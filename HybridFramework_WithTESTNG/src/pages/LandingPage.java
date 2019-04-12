package pages;

import utility.CommonMethods;

public class LandingPage {

	public static void membershiplink(String locatorVariable) {
		CommonMethods.handlingHovering_WithoutClick(locatorVariable);
	}

	public static void individualLink(String locatorVariable) {
		CommonMethods.handlingHovering_WithClick(locatorVariable);
	}
}
