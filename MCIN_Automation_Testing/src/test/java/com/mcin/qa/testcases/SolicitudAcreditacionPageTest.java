package com.mcin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcin.qa.pages.SolicitudAcreditacionPage;

public class SolicitudAcreditacionPageTest extends SolicitudAcreditacionPage {
	@BeforeMethod
	public void setUp() {
		initialization();
		authentication();
		clickOnButtonAcreditacion();
	}

	@Test(priority = 1)
	public void AcreditacionSolicitanteTest() {
		fillTabDatosRelativosAlProcedimientoParaSolicitante();
		fillTabSolicitanteParaSolicitante();
		fillTabRepresentanteParaSolicitante();
		fillTabDatosDeNotificacion();
		fillTabDocumentacion();
		fillTabPresentacion();
		assertTabFirmaYPresentacionDeSolicitudDataParaSolicitante();
		enviarSolicitud();
		assertSolicitudFirmadaYPresentada();
	}

	@Test(priority = 2)
	public void AcreditacionRepresentanteTest() {
		fillTabDatosRelativosAlProcedimientoParaRepresentante();
		fillTabSolicitanteParaRepresentante();
		fillTabRepresentanteParaRepresentanteFisica();
		fillTabDatosDeNotificacion();
		fillTabDocumentacion();
		fillTabPresentacion();
		assertTabFirmaYPresentacionDeSolicitudDataParaRepresentanteFisica();
		enviarSolicitud();
		assertSolicitudFirmadaYPresentada();
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}
}
