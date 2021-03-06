package com.mcin.qa.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mcin.qa.util.WebEventListener;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

//	By buttonAcceder = By.xpath("//*[@id=\"formularioPrincial\"]/div/div/div/div[3]/div/div/button");
	By buttonAcceder = By.xpath("//*[@class=\"btn btn-primary\"]");
//	By buttonAccess = By.xpath("//*[@onclick=\"JAVASCRIPT:selectedIdP('AFIRMA');idpRedirect.submit();\"]");
	By buttonAccess = By.xpath("(//*[@class=\"btn_readmore propiedadCSS3\"])[1]");
	By buttonNuevaSolicitud = By.xpath("//*[@data-ng-click=\"NuevaSolicitud()\"]");

	// Read from Properties file

	public TestBase() {
		try {
			// Create Object of propreties class
			prop = new Properties();
			// Location of the Propreties File
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\developer\\git\\repository\\MCIN_Automation_Testing\\src\\main\\java\\com\\mcin\\qa\\config\\config.properties");
			// Connection between the Java Code and the Propreties File (Load Properties)
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		// Browser initialization

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
			driver = new ChromeDriver();
		}

		else if (browserName.equals("FF")) {
			FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("IE")) {
			InternetExplorerDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
			driver = new InternetExplorerDriver();
		}

		// Read from Event Listener Class (Generation of selenium actions logs)

		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		// Browser management

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		wait = new WebDriverWait(driver, 30);
	}

	// Implicit wait

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

	// Scroll down

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,130)");
	}

	// Authentication Method

	public void authentication() {
		clickOnButtonAcceder();
		chooseChromeCertificate();
		clickOnButtonNuevaSolicitud();
	}

	public void clickOnButtonAcceder() {
//		driver.findElement(buttonAcceder).click();
//		sleep(null);
		sleep(2000L);
		wait.until(ExpectedConditions.elementToBeClickable(buttonAcceder)).click();
		sleep(null);
	}

	public void clickOnButtonAccess() {
		driver.findElement(buttonAccess).click();
		sleep(null);
//		wait.until(ExpectedConditions.elementToBeClickable(buttonAccess)).click();
//		sleep(null);
	}

	public void clickOnButtonNuevaSolicitud() {
//		driver.findElement(buttonNuevaSolicitud).click();
		sleep(2000L);
		wait.until(ExpectedConditions.elementToBeClickable(buttonNuevaSolicitud)).click();
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

}
