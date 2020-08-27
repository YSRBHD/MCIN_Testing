package com.mcin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcin.qa.pages.SolicitudHomologacionPage;

public class SolicitudHomologacionPageTest extends SolicitudHomologacionPage {

	@BeforeMethod
	public void setUp() {
		initialization();
		authentication();
		clickOnButtonHomologacion();
	}

	@Test(priority = 1)
	public void homologacionTest() {
		fillTabDatosRelativosAlProcedimientoParaSolicitante();
		fillTabSolicitanteParaSolicitante();
		fillTabRepresentanteParaSolicitante();
		fillTabDatosDeNotificacion();
		fillTabDocumentacion();
		fillTabPagosDeTasas();
		fillTabPresentacion();
		assertTabFirmaYPresentacionDeSolicitudDataParaSolicitante();
		enviarSolicitud();
		assertSolicitudFirmadaYPresentada();
	}

//	@Test(priority = 2)
//	public void crmLogoImageTest() {
//		boolean flag = loginPage.validateCRMImage();
//		Assert.assertTrue(flag);
//	}
//
//	@Test(priority = 3)
//	public void loginTest() {
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}