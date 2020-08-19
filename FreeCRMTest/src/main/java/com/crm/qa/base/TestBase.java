package com.crm.qa.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	By buttonAcceder = By.xpath("//*[@id=\"formularioPrincial\"]/div/div/div/div[3]/div/div/button");
	By buttonAccess = By.xpath("//*[@id=\"tooltip1\"]/div[2]/div/fieldset/div");

	public TestBase() {

		try {
			// Create Object of propreties class
			prop = new Properties();
			// Location of the Propreties File
			FileInputStream ip = new FileInputStream(
					"C:\\Development\\MCIN\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			// Connection between the Java Code and the Propreties File (Load Properties)
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equals("FF")) {
			ChromeDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("IE")) {
			ChromeDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

	public void sleep(Long time) {
		if (time == null) {
			time = 1000L;
		}
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// ========== Authentication ========== //

	public void clickOnButtonAcceder() {
		driver.findElement(buttonAcceder).click();
		sleep(null);
	}

	public void clickOnButtonAccess() {
		driver.findElement(buttonAccess).click();
		sleep(null);
	}

	public void chooseChromeCertificate() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					clickOnButtonAccess();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		// Choose first certificate
		try {
			Robot robot = new Robot();
			Thread t = new Thread(r);
			t.start();
			robot.delay(10000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
	}

	public void authentication() {
		clickOnButtonAcceder();
		chooseChromeCertificate();

	}

}
