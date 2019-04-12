package utility;

import org.openqa.selenium.By;

public class LocatorsSplitFunction {

	public static By locsplit(String locatorVariable) { //membershiplink_LandingPage
															//xpath://*[@id=\"tm-233\"]  //name:ctl00$Body$btnJoinNo
		String loc_Type = locatorVariable.split(":")[0];
		String loc_Value = locatorVariable.split(":")[1]; 
		
		if (loc_Type.equalsIgnoreCase("Name")) {
			return By.name(loc_Value);
		} 
		else if (loc_Type.equalsIgnoreCase("Id")) {
			return By.id(loc_Value);
		} 
		else if (loc_Type.equalsIgnoreCase("Linktext")) {
			return By.linkText(loc_Value);
		} 
		else if (loc_Type.equalsIgnoreCase("Partiallinktext")) {
			return By.partialLinkText(loc_Value);
		} 
		else if (loc_Type.equalsIgnoreCase("xpath")) {
			return By.xpath(loc_Value);
		} 
		else if (loc_Type.equalsIgnoreCase("cssselector")) {
			return By.cssSelector(loc_Value);
		} 
		else {
			return null;
		}
	}
}
