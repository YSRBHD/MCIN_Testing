package org.mcin.tests.solicitud;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class EquivalenciaEsTestCase {

//	  TEST CASE 1 : We will create a new "Solicitud" like "Solicitante" type
//	 "Equivalencia" and check if all the data is correctly generated in the
//	 "Presentacion Tab".

	@Test
	public void EquivalenciaSolicitanteEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		EquivalenciaEsPageObject solicitante = new EquivalenciaEsPageObject(driver);

		solicitante.autentification();
		solicitante.createSolicitanteEquivalencia();
		solicitante.fillTabDatosRelativosAlProcedimiento();
		solicitante.fillTabSolicitante();
		solicitante.fillTabRepresentante();
		solicitante.fillTabDatosDeNotificacion();
		solicitante.fillTabDocumentacion();
		solicitante.fillTabPagosDeTasas();
		solicitante.fillTabPresentacion();
		solicitante.checkTabFirmaYPresentacionDeSolicitudData();
		solicitante.checkSolicitudFirmadaYPresentada();
		driver.quit();
	}

//	  TEST CASE 2 : We will create a new "Solicitud" like "Representante Juridica" type
//	 "Equivalencia" and check if all the data is correctly generated in the
//	 "Presentacion Tab".
//
//	@Test
//	public void EquivalenciaRepresentanteJuridicaEs() {
//
//		WebDriver driver;
//		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://80.59.232.152:8081/MCIN/");
//		// driver.get("http://82.223.77.136:8081/MCIN/");
//		EquivalenciaEsPageObject solicitante = new EquivalenciaEsPageObject(driver);
//
//		solicitante.autentification();
//		solicitante.createRepresentanteEquivalencia();
//		solicitante.fillTabDatosRelativosAlProcedimientoParaRepresentante();
//		solicitante.fillTabSolicitanteParaRepresentante();
//		solicitante.fillTabRepresentanteParaRepresentanteJuridica();
//		solicitante.fillTabDatosDeNotificacion();
//		solicitante.fillTabDocumentacion();
//		solicitante.fillTabPagosDeTasas();
//		solicitante.fillTabPresentacion();
//		solicitante.checkTabFirmaYPresentacionDeSolicitudDataParaRepresentanteJuridica();
//		solicitante.checkSolicitudFirmadaYPresentadaRepresentante();
//		driver.quit();
//	}

//	  TEST CASE 3 : We will create a new "Solicitud" like "Representante Fisica" type
//	 "Equivalencia" and check if all the data is correctly generated in the
//	 "Presentacion Tab".

	@Test
	public void EquivalenciaRepresentanteFisicaEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		EquivalenciaEsPageObject representante = new EquivalenciaEsPageObject(driver);

		representante.autentification();
		representante.createRepresentanteEquivalencia();
		representante.fillTabDatosRelativosAlProcedimientoParaRepresentante();
		representante.fillTabSolicitanteParaRepresentante();
		representante.fillTabRepresentanteParaRepresentanteFisica();
		representante.fillTabDatosDeNotificacion();
		representante.fillTabDocumentacion();
		representante.fillTabPagosDeTasas();
		representante.fillTabPresentacion();
		representante.checkTabFirmaYPresentacionDeSolicitudDataParaRepresentanteFisica();
		representante.checkSolicitudFirmadaYPresentadaRepresentante();
		driver.quit();
	}

}
