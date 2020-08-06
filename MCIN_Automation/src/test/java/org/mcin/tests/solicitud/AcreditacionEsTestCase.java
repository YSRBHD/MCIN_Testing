package org.mcin.tests.solicitud;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class AcreditacionEsTestCase {

//	  TEST CASE 1 : We will create a new "Solicitud" like "Solicitante" type
//	 "Acreditacion" and check if all the data is correctly generated in the
//	 "Presentacion Tab".

	@Test
	public void acreditacionSolicitanteEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		AcreditacionEsPageObject solicitante = new AcreditacionEsPageObject(driver);

		solicitante.autentification();
		solicitante.createSolicitanteAcreditacion();
		solicitante.fillTabDatosRelativosAlProcedimiento();
		solicitante.fillTabSolicitante();
		solicitante.fillTabRepresentante();
		solicitante.fillTabDatosDeNotificacion();
		solicitante.fillTabDocumentacion();
		solicitante.fillTabPresentacion();
		solicitante.checkTabFirmaYPresentacionDeSolicitudData();
		solicitante.checkSolicitudFirmadaYPresentada();
		driver.quit();
	}

//	  TEST CASE 2 : We will create a new "Solicitud" like "Representante Juridica" type
//   "Acreditacion" and check if all the data is correctly generated in the
//	 "Presentacion Tab".
//	@Test
//	public void acreditacionRepresentanteJuridicaEs() {
//
//		WebDriver driver;
//		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://80.59.232.152:8081/MCIN/");
//
//		AcreditacionEsPageObject solicitante = new AcreditacionEsPageObject(driver);
//
//		solicitante.autentification();
//		solicitante.createRepresentanteAcreditacion();
//		solicitante.fillTabDatosRelativosAlProcedimientoParaRepresentante();
//		solicitante.fillTabSolicitanteParaRepresentante();
//		solicitante.fillTabRepresentanteParaRepresentanteJuridica();
//		solicitante.fillTabDatosDeNotificacion();
//		solicitante.fillTabDocumentacion();
//		solicitante.fillTabPresentacion();
//		solicitante.checkTabFirmaYPresentacionDeSolicitudDataParaRepresentanteJuridica();
//		solicitante.checkSolicitudFirmadaYPresentadaRepresentante();
//		driver.quit();
//	}
//

//	  TEST CASE 3 : We will create a new "Solicitud" like "Representante Fisica" type
//	 "Acreditacion" and check if all the data is correctly generated in the
//	 "Presentacion Tab".
	@Test
	public void acreditacionRepresentanteFisicaEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		AcreditacionEsPageObject representante = new AcreditacionEsPageObject(driver);

		representante.autentification();
		representante.createRepresentanteAcreditacion();
		representante.fillTabDatosRelativosAlProcedimientoParaRepresentante();
		representante.fillTabSolicitanteParaRepresentante();
		representante.fillTabRepresentanteParaRepresentanteFisica();
		representante.fillTabDatosDeNotificacion();
		representante.fillTabDocumentacion();
		representante.fillTabPresentacion();
		representante.checkTabFirmaYPresentacionDeSolicitudDataParaRepresentanteFisica();
		representante.checkSolicitudFirmadaYPresentadaRepresentante();
		driver.quit();
	}
}
