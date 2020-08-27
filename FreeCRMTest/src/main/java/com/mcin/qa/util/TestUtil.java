package com.mcin.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mcin.qa.base.TestBase;

public class TestUtil extends TestBase {
	// Generation of Screenshots if a execption is thrown

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "\\Screenshots\\" + System.currentTimeMillis() + ".png"));
	}
}
