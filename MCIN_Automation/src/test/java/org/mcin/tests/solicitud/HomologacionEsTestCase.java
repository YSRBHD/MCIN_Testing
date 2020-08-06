package org.mcin.tests.solicitud;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class HomologacionEsTestCase {

//	  TEST CASE 1 : We will create a new "Solicitud" like "Solicitante" type
//	 "Homologacion" and check if all the data is correctly generated in the
//	 "Presentacion Tab".

	@Test
	public void homologacionSolicitanteEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		HomologacionEsPageObject solicitante = new HomologacionEsPageObject(driver);

		solicitante.autentification();
		solicitante.createSolicitanteHomologacion();
		solicitante.fillTabDatosRelativosAlProcedimientoParaSolicitante();
		solicitante.fillTabSolicitanteParaSolicitante();
		solicitante.fillTabRepresentanteParaSolicitante();
		solicitante.fillTabDatosDeNotificacion();
		solicitante.fillTabDocumentacion();
		solicitante.fillTabPagosDeTasas();
		solicitante.fillTabPresentacion();
		solicitante.checkTabFirmaYPresentacionDeSolicitudDataParaSolicitante();
		solicitante.checkSolicitudFirmadaYPresentadaSolicitante();
		driver.quit();
	}
//
//	  TEST CASE 2 : We will create a new "Solicitud" like "Representante Juridica" type
//	 "Homologacion" and check if all the data is correctly generated in the
//	 "Presentacion Tab".
//	
//	@Test
//	public void homologacionRepresentanteJuridicaEs() {
//
//		WebDriver driver;
//		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://80.59.232.152:8081/MCIN/");
//
//		HomologacionEsPageObject solicitante = new HomologacionEsPageObject(driver);
//
//		solicitante.autentification();
//		solicitante.createRepresentanteHomologacion();
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
//
//	  TEST CASE 3 : We will create a new "Solicitud" like "Representante Fisica" type
//	 "Homologacion" and check if all the data is correctly generated in the
//	 "Presentacion Tab".

	@Test
	public void homologacionRepresentanteFisicaEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		HomologacionEsPageObject representante = new HomologacionEsPageObject(driver);

		representante.autentification();
		representante.createRepresentanteHomologacion();
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
