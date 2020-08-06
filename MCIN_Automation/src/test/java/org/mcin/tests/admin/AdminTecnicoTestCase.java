package org.mcin.tests.admin;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class AdminTecnicoTestCase {

//	  TEST CASE 1 : We will create new "Usuarios" and check if all the data is correctly generated
	@Test
	public void adminTecnicoNuevoUsuario() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevoUsuario();
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

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevoRole();
		driver.quit();
	}

//	  TEST CASE 3 : We will create new "Funcionalidades" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevaFuncionalidad() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevaFuncionalidad();
		driver.quit();
	}

//	  TEST CASE 4 : We will create new "Pais" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevoPais() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevoPais();
		driver.quit();
	}

//	  TEST CASE 5 : We will create new "Notificacion" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevaNotificacion() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevaNotificacion();
		driver.quit();
	}

//	  TEST CASE 6 : We will create new "Etiquita" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevaEtiquita() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevaEtiquita();
		driver.quit();
	}

//	  TEST CASE 7 : We will create new "Plazo" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevoPlazo() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevoPlazo();
		driver.quit();
	}

//      TEST CASE 8 : We will create new "Plazo" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevaIdioma() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevaIdioma();
		driver.quit();
	}

//  TEST CASE 9 : We will create new "Tasa" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevaTasa() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevaTasaAdminTecnico();
		driver.quit();
	}

//  TEST CASE 10 : We will create new "Tipo de Subsanacion" and check if all the data is correctly generated
	@Test
	public void adminFunctionalNuevoTipoSubsanacion() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/Admin");

		AdminTecnicoPageObject adminTecnico = new AdminTecnicoPageObject(driver);
		adminTecnico.autentificationAdminTecnicol();
		adminTecnico.crearNuevoTipoSubsanacion();
		driver.quit();
	}
}
