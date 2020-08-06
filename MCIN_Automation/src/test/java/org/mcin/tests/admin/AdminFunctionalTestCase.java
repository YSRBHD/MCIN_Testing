package org.mcin.tests.admin;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class AdminFunctionalTestCase {

//	  TEST CASE 1 : We will create new "Usuarios" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevoUsuario() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminFunctionalPageObject adminFunctional = new AdminFunctionalPageObject(driver);
		adminFunctional.autentificationAdminFunctional();
		adminFunctional.crearNuevoUsuario();
		driver.quit();
	}

//	  TEST CASE 2 : We will create new "Roles" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevoRole() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminFunctionalPageObject adminFunctional = new AdminFunctionalPageObject(driver);
		adminFunctional.autentificationAdminFunctional();
		adminFunctional.crearNuevoRole();
		driver.quit();
	}

//	  TEST CASE 3 : We will create new "Tasas" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevaTasa() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminFunctionalPageObject adminFunctional = new AdminFunctionalPageObject(driver);
		adminFunctional.autentificationAdminFunctional();
		adminFunctional.crearNuevaTasaAdminFunctional();
		driver.quit();
	}

//	  TEST CASE 4 : We will create new "Medidas Generales" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevaMedidaGeneral() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminFunctionalPageObject adminFunctional = new AdminFunctionalPageObject(driver);
		adminFunctional.autentificationAdminFunctional();
		adminFunctional.crearNuevaMedidaGeneral();
		driver.quit();
	}

//	  TEST CASE 5 : We will create new "Calendarios" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevoCalendario() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminFunctionalPageObject adminFunctional = new AdminFunctionalPageObject(driver);
		adminFunctional.autentificationAdminFunctional();
		adminFunctional.crearNuevoCalendarios();
		driver.quit();
	}
}
