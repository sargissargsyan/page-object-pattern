package helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import static helpers.DriverHelper.*;

/**
 * Created by sargis on 11/13/16.
 */
public class WaitHelper {
	public static WaitHelper isLoaded() {
		WaitHelper loadHelper = new WaitHelper();
		return loadHelper;
	}

	public WaitHelper isElementIsClickable(By by) {
		try {
			new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(by));
			return this;
		} catch (WebDriverException e) {
			throw new Error("Element is not clickable");
		}
	}

	public WaitHelper isElementIsVisible(By by) {
		try {
			new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOfElementLocated(by));
			return this;
		} catch (WebDriverException e) {
			throw new Error("Element is not visible");
		}
	}
}
