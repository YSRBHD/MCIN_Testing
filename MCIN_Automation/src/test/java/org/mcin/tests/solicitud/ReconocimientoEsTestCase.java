package org.mcin.tests.solicitud;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class ReconocimientoEsTestCase {

//	  TEST CASE 1 : We will create a new "Solicitud" like "Solicitante" type
//	 "Reconocimiento" and check if all the data is correctly generated in the
//	 "Presentacion Tab".

	@Test
	public void reconocimientoSolicitanteEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		ReconocimientoEsPageObject solicitante = new ReconocimientoEsPageObject(driver);

		solicitante.autentification();
		solicitante.createSolicitanteReconocimiento();
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

//
//	  TEST CASE 3 : We will create a new "Solicitud" like "Representante Fisica" type
//	 "Reconocimiento" and check if all the data is correctly generated in the
//	 "Presentacion Tab".
//
	@Test
	public void reconocimientoRepresentanteFisicaEs() {

		WebDriver driver;
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.28.1.208:8081/MCIN/");

		ReconocimientoEsPageObject representante = new ReconocimientoEsPageObject(driver);

		representante.autentification();
		representante.createRepresentanteReconocimiento();
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
